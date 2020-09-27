package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
	
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.print("]");
	}

	// b)
	public static String tilStreng (int[] tabell) {
		
		String returnStreng = "";
		int i = 0;
		
		while (i<tabell.length) {
			returnStreng += tabell[i] + ",";
			i++;	
		}
		returnStreng += tabell[i];
		
		return ("[" + returnStreng + "]");
		
	}

	// c) For-løkke
	public static int summerA (int[] tabell) {
		
		int sum = 0;
		
		for (int i=0; i<tabell.length; i++) {
			
			sum += tabell [i];
			
		}
		
		return sum;
		
	}
	
	// c) While-løkke
	public static int summerB (int[] tabell) {
		
		int sum = 0;
		int i=0;
			
		while (i<tabell.length) {
				
			sum += tabell [i];
			i++;
				
		}
			
		return sum;
			
	}
	
	// c) Utvidet for-løkke
	public static int summerC (int[] tabell) {
		
		int sum = 0;
		
		for (int i : tabell) {
			
			 sum += i;
			
		}
		
		return sum;
		
		}

	// d)
	public static boolean finnesTall (int[] tabell, int tall) {
		
		boolean resultat = false;
		int i = 0;
		
		while (!resultat && i<tabell.length) {
			
			if (tabell [i] == tall) {
				resultat = true;
			}
			else i++;
		}
		
		return resultat;
		
	}

	// e)
	public static int posisjonTall (int[] tabell, int tall) {
		
		int i = 0;
		
		while (i<tabell.length) {
			if (tabell[i]==tall) {
				return i;
			}
			else i++;
		}
		return -1;
		
		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int returtab [] = new int [tabell.length];
		
		int x = 1;
		
		for (int i = 0; i<tabell.length; i++) {
			
			int sistePos = tabell[tabell.length-x];
			returtab [i] = sistePos;
			x++;
			
		}
		
		return returtab;
		
	}

	// g)
	public static boolean erSortert (int[] tabell) {
		
		boolean resultat = true;
		int i = 0;
		
		while (resultat && i < tabell.length-1) {
			
			if (tabell [i] > tabell[i+1]){
				resultat = false;
			}
			i++;
		}
		
		return resultat;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int lengde = tabell1.length + tabell2.length;
		int [] tabSammen = new int [lengde];
		
		for (int i=0; i<tabell1.length; i++) {
			tabSammen[i] = tabell1[i];
		}
		
		for (int j=0; j<tabell2.length; j++) {
			tabSammen[tabell1.length + j] = tabell2[j];
		}
		
		return tabSammen;
	}
}
