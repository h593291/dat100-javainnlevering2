package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	// a)
	public static void skrivUtv1(int[][] matrise) {
		
		System.out.print("[ ");
		
		for (int []i : matrise) {
			
			for (int j : i) {
				System.out.print(j + " ");
				
			}
								
		}
		
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String returnStreng = "";
		String a = "";
		
		for (int []i : matrise) {
			
			for (int j : i) {
				a += j + " ";
				
			}
			returnStreng += a + "\n";
			a = "";
		}
		
		return returnStreng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int returnTab [][] = new int [matrise.length][matrise[0].length];
		
		for (int i = 0; i<matrise.length; i++) {
			
			for (int j = 0; j<matrise[0].length; j++) {
				
				returnTab[i][j] = matrise[i][j] * tall;
				
			}
			
		}
		
		return returnTab;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean svar = true;
				
		for (int i = 0; i<a.length; i++) {
						
				for (int j = 0; j<a[0].length; j++) {
					
					if (a[i][j]!=b[i][j]) {
						
						svar = false;
					}
					
				}
			}
		
		return svar;
		}
	
}
	
