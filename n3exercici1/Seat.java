package n3exercici1;

public class Seat {

	private int rowNum;
	private int seatNum;
	private String name;
	
	public Seat (int rowNum, int seatNum, String name) {
		this.rowNum = rowNum;
		this.seatNum = seatNum;
		this.name = name;
	}

	public int getRowNum() {
		return rowNum;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public String getName() {
		return name;
	}
	public boolean equals(int rowNum, int seatNum) {
		if (this.rowNum == rowNum && this.seatNum == seatNum) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return "Fila: " + this.rowNum + ", Seient: " + this.seatNum + ", Persona: " + this.name;
	}

	
}
