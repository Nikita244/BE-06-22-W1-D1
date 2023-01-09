package it.epicode.be;
import java.util.Arrays;

public class esercizio2 {

	public static void main(String[] args) {
		// --- moltiplica: due interi e ritorna il loro prodotto
		int x = 10;
		int y = 15;
		
		int moltiplica = moltiplica(x, y);
		System.out.println("1) " + moltiplica);

		// --- concatena: una stringa e un intero
		// metodo 1
		String testo = "Eta:";
		int num = 30;
		
		concatena1(testo, num);
		
		// metodo 2
		String nome = "Mario";
		String cognome = "Rossi";
		
		String risultato = concatena2(nome, cognome);
		System.out.println("2b) " + risultato);

		// --- inserisci in array una stringa al terzo posto facendo scalare gli altri
		String z = "parola"; // la stringa da inserire al terzo posto
		String[] array = {"a", "b", "c", "d", "e"}; // array vecchio
		
		String risultatoArray = inserimentoArray(z, array);
		System.out.println("3) " + risultatoArray);
	}


	
	  public static int moltiplica(int x, int y) {
			return x * y;
	  }
	  
	  static void concatena1(String testo, int num) {
			System.out.println("2a) " + testo + num);
	  }
	  
	  public static String concatena2(String nome, String cognome) {
			String glue = nome.concat(cognome);
			return glue;
	  }
	  
	  public static String inserimentoArray(String z, String[] array) {
			String[] arrayNuovo = new String[6]; // array nuovo con 6 posti
			// l'unica soluzione che son riuscito a trovare con le conoscenze attuali
			arrayNuovo[0] = array [0];
			arrayNuovo[1] = array [1];
			arrayNuovo[2] = z;
			arrayNuovo[3] = array [2];
			arrayNuovo[4] = array [3];
			arrayNuovo[5] = array [4];
			
			return Arrays.toString(arrayNuovo);
	  }
}
