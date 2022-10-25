package n3exercici1;

import java.util.ArrayList;

public class SeatManagment {
	
	private ArrayList<Seat> seats;
	
	public SeatManagment() {
		this.seats = new ArrayList<Seat>();
	}
	public ArrayList<Seat> getSeats() {
		return this.seats;
	}
	public void addSeat(Seat newseat) {
		int i = 0;
		try {
			i = searchSeat(newseat.getRowNum(), newseat.getSeatNum());			
				if (i == -1) {
					this.seats.add(newseat);
				} else {
					throw new OccupiedSeatException();
			}
		} catch (OccupiedSeatException e) {
				System.out.println(e.getMessage());
			}
	}
	public void deleteSeat(int rowNum, int seatNum) {
		int i = 0;
		try {
			 i = searchSeat(rowNum, seatNum);			
				if (i != -1) {
					this.seats.remove(i);
				} else {
					throw new FreeSeatException();
			}
		} catch (FreeSeatException e) {
				System.out.println(e.getMessage());
			}
	}
	public int searchSeat(int rowNum, int seatNum) {
		int i = -1;
		for (Seat seat : this.seats) {
			if (seat.equals(rowNum, seatNum) == true) {
				i = this.seats.indexOf(seat);
				break;
			} else {
				i = -1;
			}
	}
		return i;
		
	}

}
