package n2excercici1;

public class ComentariOutOfLenghException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ComentariOutOfLenghException() {
		
	}
	public String getMessage() {
		return "El comentari no pot sobrepassar els 100 caracters";
	}

}
