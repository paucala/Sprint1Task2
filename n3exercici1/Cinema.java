package n3exercici1;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
		
	private int rows;
	private int seatsForRow;
	private SeatManagment seats;
	
	Scanner entry = new Scanner(System.in);
	
	public Cinema () {
		this.seats = new SeatManagment();
		this.InitialData();
	}
	public void iniciar() {
		int op = 0;
		do {
			op = menu();
			switch(op) {
			case 1:
				showSeats();
				break;
			case 2:
				showSeatsforPerson();
				break;
			case 3:
				bookSeat();
				break;
			case 4:
				cancelBooking();
				break;
			case 5:
				cancelPersonBooking();
				break;
			case 0:
				System.out.println("Adeu");
				break;
			default:
				System.out.println("El número no és correcte");
				op = menu();
			}
			
		} while (op != 0);
		
	}
	public int menu() {
		System.out.println("Escull una opció \n"
				+ "1.- Mostrar totes les butaques reservades.\n"
				+ "2.- Mostrar les butaques reservades per una persona.\n"
				+ "3.- Reservar una butaca.\n"
				+ "4.- Anul·lar la reserva d’una butaca.\n"
				+ "5.- Anul·lar totes les reserves d’una persona.\n"
				+ "0.- Sortir.");
		int op = entry.nextInt();
		entry.nextLine();
		return op;

		
	}
	public void showSeats() {
		for (Seat seat : this.seats.getSeats()) {
			System.out.println(seat.toString());
		}
	}
	public void showSeatsforPerson() {
		System.out.println("Introdueix el nom de la persona");
		String name = entry.nextLine();
		for (Seat seat : this.seats.getSeats()) {
			if (name.equalsIgnoreCase(seat.getName())) {
				System.out.println(seat.toString());
			}
		}
	}
	public void bookSeat() {
		int row = insertRow();
		int seat = insertSeat();
		String name = insertName();
		Seat newSeat = new Seat(row, seat, name);
		seats.addSeat(newSeat);
	}
	public void cancelBooking() {
		int rowtoDelete = insertRow();
		int seattoDelete = insertSeat();
		seats.deleteSeat(rowtoDelete, seattoDelete);
	}
	public void cancelPersonBooking() {
		String NametoDelete = insertName();
		for (int i = 0; i < seats.getSeats().size(); i++) {
			if (seats.getSeats().get(i).getName().equalsIgnoreCase(NametoDelete) == true){
				seats.deleteSeat(seats.getSeats().get(i).getRowNum(), seats.getSeats().get(i).getSeatNum());
				i--;
			}
		}
	}
	public int insertRow() {
		boolean correct = false;
		int rowNum = 0;
		do {
			System.out.println("Número de fila: ");
			rowNum = entry.nextInt();
			entry.nextLine();
			try {
				if (rowNum < 0 || rowNum > this.rows) {
					throw new WrongRowException(); 
				}
				correct = true;
			} catch (WrongRowException e) {
				System.out.println(e.getMessage());
			}
		} while (correct == false);
		return rowNum;
		
	}
	public int insertSeat() {
		boolean correct = false;
		int seatNum = 0;
		do {
			System.out.println("Número de seient: ");
			seatNum = entry.nextInt();
			entry.nextLine();
			try {
				if (seatNum < 0 || seatNum > this.seatsForRow) {
					throw new WrongSeatException(); 
				}
				correct = true;
			} catch (WrongSeatException e) {
				System.out.println(e.getMessage());
			}
		} while (correct == false);
		return seatNum;
		
	}
	public String insertName() {
		boolean correct = false;
		String name = "";
		do {
			System.out.println("Nom de la persona: ");
			name = entry.nextLine();		
			try {
				if (name.matches(".*[0-9].*") == true) {
					throw new WrongNameException(); 
				} else {
					correct = true;
				}
			} catch (WrongNameException e) {
				System.out.println(e.getMessage());
			}
		} while (correct == false);
		return name;
	}

	public void InitialData() {
		System.out.println("Introdueix el nombre total de files");
		rows = entry.nextInt();
		System.out.println("Introdueix el nombre total de seients per fila");
		seatsForRow = entry.nextInt();
		
	}

}
