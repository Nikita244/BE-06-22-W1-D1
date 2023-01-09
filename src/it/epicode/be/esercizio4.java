package it.epicode.be;

public class esercizio4 {

	public static void main(String[] args) {
		// --- calcola il perimetro di un rettangolo
				// formula (larghezza + lunghezza) * 2
				double larghezza = 10.5;
				double lunghezza = 25.3;
				double perimetro = perimetro(larghezza, lunghezza);
				System.out.println("il perimetro del rettangolo è di: " + perimetro);
				
		// --- pariDispari
				int numero = 69;
				String risultatoPariDispari = calcolaPD(numero);
				System.out.println(numero + risultatoPariDispari);

		// --- calcola l'area di un triangolo
				// formula (base * altezza) / 2
				double base = 15.6;
				double altezza = 22.9;
				double risultatoArea = area(base, altezza);
				System.out.println("l'area del triangolo è di: " + risultatoArea);
			}
			
			static double perimetro(double lar, double lun) {
				double calcola = (lar + lun) * 2;
				return calcola;
			}
			
			static String calcolaPD(int num) {
			    // verifica se il resto che esce è 0 (pari) o no
			    if (num % 2 == 0) {
			      return " è pari";
			    } else {
			      return " è dispari";
			    }
			}
			
			static double area(double b, double a) {
				double area = (b * a) / 2;
				// siccome tante volte esce i decimali stra lunghi ho deciso di fare un arrotondamento
				double arrotondato = Math.round(area * 100.0) / 100.0;
				return arrotondato;

	}

}
