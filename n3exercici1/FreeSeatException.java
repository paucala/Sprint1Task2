package n3exercici1;

public class FreeSeatException extends Exception {
	
	public FreeSeatException() {
	}
	
	public String getMessage() {
		return "La butaca està lliure";
	}

}
