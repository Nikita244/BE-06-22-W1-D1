package it.epicode.be;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String[] stringa = new String[3];
		
		System.out.println("Inserisci primo messaggio:");
		stringa[0] = scanner.nextLine();
		System.out.println("Inserisci secondo messaggio:");
		stringa[1] = scanner.nextLine();
		System.out.println("Inserisci terzo messaggio:");
		stringa[2] = scanner.nextLine();
		
		System.out.println("ordine inserimento: ");
		System.out.println(stringa[0] + " - " + stringa[1] + " - " + stringa[2]);
		
		System.out.println("ordine inverso: ");
		System.out.println(stringa[2] + " - " + stringa[1] + " - " + stringa[0]);
		
	
		scanner.close();

	}

}
