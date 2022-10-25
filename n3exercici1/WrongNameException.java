package n3exercici1;

public class WrongNameException extends Exception {
	
	public WrongNameException() {
	}
	
	public String getMessage() {
		return "El nom no pot contenir nombres";
	}
}
