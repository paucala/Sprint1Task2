package n2excercici1;

public class InicialMinusculaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InicialMinusculaException(){
	}
	public String getMessage() {
		return "La lletra ha d'estar en majuscula";
	}

}
