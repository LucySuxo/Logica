package estruturaRepFor;

import java.util.Scanner;

public class ExercicioVIII {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores.
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um número: ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N  ; i ++ ) {
			if(N % i == 0) {
				System.out.println("Números divisores: " + i);
			}
		}
		
		
		sc.close();

	}

}
