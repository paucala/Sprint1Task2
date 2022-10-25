package n3exercici1;

public class WrongSeatException  extends Exception {
	
	public WrongSeatException() {
	}
	
	public String getMessage() {
		return "El seient introduit no existeix";
	}
}
