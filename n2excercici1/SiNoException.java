package n2excercici1;

public class SiNoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public SiNoException() {
		
	}
	public String getMessage() {
		return "Ha de respondre amb s/n";
	}

}
