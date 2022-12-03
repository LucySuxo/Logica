package estruturaRepFor;

import java.util.Scanner;

public class ExercicioX {

	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
		
		Scanner sc = new Scanner(System.in);
		
		
		int N, R=1;
		
		System.out.println("Digite um valor :");
		N = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i ++) {
			R = R * i;
		
		}
		
		System.out.println(R);
		
		sc.close();

	}

}
