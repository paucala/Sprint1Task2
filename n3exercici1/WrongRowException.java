package n3exercici1;

public class WrongRowException extends Exception {
	
	public WrongRowException() {
	}
	
	public String getMessage() {
		return "La fila introduida no existeix";
	}

}
