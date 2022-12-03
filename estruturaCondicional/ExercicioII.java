package estruturaCondicional;

import java.util.Scanner;

public class ExercicioII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		if ( number % 2 == 0) {
			System.out.println("É um número par!");
		}else {
			System.out.println("É um número impar!");
		}
		
		
		sc.close();

	}

}
