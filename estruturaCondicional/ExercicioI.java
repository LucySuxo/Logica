package estruturaCondicional;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		if (number <0) {
			System.out.println("É um número negativo");
		} else {
			System.out.println("É um número positivo");
		}
		sc.close();
	}

}
