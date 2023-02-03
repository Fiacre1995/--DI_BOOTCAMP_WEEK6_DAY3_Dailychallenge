import java.util.Scanner;

public class Dailychallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrez un nombre ");
		int Nbre = scanner.nextInt();
		
		for (int i = 0; i < 11; i++) {
			
			int Resultat = Nbre * i;
			System.out.println(Resultat);
			
		}
		
		System.out.println(" =============================================== ");
		System.out.println("            **********  FACTORIEL  **********       ");
		System.out.println(" =============================================== ");
		
		int Nbre1 = Nbre - 1;
		int resultat2 = Nbre;
		
		while (Nbre1 != 0) {
			
			resultat2 = resultat2 * Nbre1;
			
			Nbre1 = Nbre1 -1;
			
		}
		
		System.out.println(resultat2);
		
		
		System.out.println(" =============================================== ");
		System.out.println("            **********  FUBONACCI  **********       ");
		System.out.println(" =============================================== ");
		
		int a = 0;
		int b = 1;
		int c;
		
		do {
	          
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
			 
	      } while (c < Nbre);
	}

}
