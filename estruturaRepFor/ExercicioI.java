package estruturaRepFor;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N, soma = 0;
		
		System.out.println("Digite a quantidade de números que devem ser digitados");
		N = sc.nextInt();
		
		for (int i = 0; i < N ; i ++) {
			System.out.println("Digite um número");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		
		sc.close();

	}

}
