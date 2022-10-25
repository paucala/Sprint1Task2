package n2excercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntrada {
	static Scanner entry = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		llegirByte("Digues la teva edat");
		llegirInt("Any de naixement");
		llegirFloat("Introdueix el preu de l'objecte");
		llegirDouble("Escriu el número pi amb tants decimals com vulguis");
		llegirChar("Escriu la teva inicial");
		llegirString("Redacta un comentari");
		llegirSiNo("Escull si o no (s/n)");

		
	/* Les quatre primeres excepcions no necessiten ser personalitzades ja que java ja les té registrades, 
	 * i seran errors comessos per l'usuari, per les últimes 3 si que necessitem crear excepcions personalitzades 
	 * ja que dona igual el que introdueixi l'usuari, java no donará error a no ser que nosaltres li diguem que ho faci*/	
		
	}
	public static byte llegirByte(String missatge) {
		byte data = 0;
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				data = entry.nextByte();
				incorrect = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format " + e.toString());
			}

			entry.nextLine();
			
		} while (incorrect);
		return data;
	}

	public static int llegirInt(String missatge) {
		int data = 0;
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				data = entry.nextInt();
				incorrect = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format " + e.toString());
			}
			entry.nextLine();
			
		} while (incorrect);
		return data;
	}

	public static float llegirFloat(String missatge) {
		float data = 0;
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				data = entry.nextFloat();
				incorrect = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format " + e.toString());
			}
			entry.nextLine();
			
		} while (incorrect);
		return data;
	}

	public static double llegirDouble(String missatge) {
		double data = 0;
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				data = entry.nextDouble();
				incorrect = false;
			} catch (InputMismatchException e) {
				System.out.println("Error de format " + e.toString());
			}
			entry.nextLine();
			
		} while (incorrect);
		return data;
	}
	public static char llegirChar(String missatge) {
		char data = ' ';
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				data = entry.nextLine().charAt(0);
				if (data != Character.toUpperCase(data)){
					throw new InicialMinusculaException ();					
				}
				incorrect = false;
			} catch (InicialMinusculaException e) {
				System.out.println("Error de format " + e.getMessage());
			}
			
		} while (incorrect);
		return data;
	}

	public static String llegirString(String missatge) {
		String string = "";
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				string = entry.nextLine();
				if (string.length() > 100) {
					throw new ComentariOutOfLenghException();
				}
				incorrect = false;
			} catch (ComentariOutOfLenghException e) {
				System.out.println("Error de format " + e.getMessage());
			}
			
		} while (incorrect);
		return string;
	}

	public static boolean llegirSiNo(String missatge) {
		//si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.
		boolean bool = false;
		boolean incorrect = true;
		do {
			try {
				System.out.println(missatge);
				Character resposta = entry.nextLine().charAt(0);
				Character.toLowerCase(resposta);
				if (resposta.equals('s')) {
					bool = true;
				} else if (resposta.equals('n')) {
					bool = false;
				} else {
					throw new SiNoException();
				}
				incorrect = false;
			} catch (SiNoException e) {
				System.out.println("Error de format " + e.getMessage());
			}
			
		} while (incorrect);
		return bool;
	}

}
