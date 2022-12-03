package estruturaRepFor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N;
		Double A,B,C, AR, BR, CR, R, P, RF;
		
		System.out.println("Digite a quantidade de vezes:");
		N = sc.nextInt();
		
		for(int i = 0; i < N ; i ++) {
			System.out.println("Digite o primeiro valor: ");
			A = sc.nextDouble();
			AR = A * 2;
			System.out.println("Digite o segundo valor: ");
			B = sc.nextDouble();
			BR = B * 3;
			System.out.println("Digite o terceiro valor: ");
			C = sc.nextDouble();
			CR = C * 5;
			R = AR + BR + CR;
			RF = R / 10;
			System.out.printf("Resultado: %.1f%n", RF);
			
		}
		
		
		
		
		sc.close();
		
		

	}

}
