package n3exercici1;

public class OccupiedSeatException extends Exception {
	
	public OccupiedSeatException() {
	}
	
	public String getMessage() {
		return "Butaca ocupada";
	}

}
