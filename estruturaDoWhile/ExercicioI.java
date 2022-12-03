package estruturaDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		char R;
		double C, F;
		
	
		do{
			System.out.println("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();	
			F = 9 * C / 5 + 32;
			System.out.printf("%nEquivalente à %.1f%n", F);
			System.out.println("Deseja repetir? (s/n) \n");
			R = sc.next().charAt(0);
		
		}while(R != 'n');
		
		
		
		
		sc.close();

	}

}
