package estruturaRepFor;

import java.util.Scanner;

public class ExercicioVIV {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.*/

		
		Scanner sc = new Scanner(System.in);
		
		int N, Q , C;
		System.out.println("Digite a quantidade de linahs: ");
		N = sc.nextInt();
		
		
		for(int i = 1 ; i <= N ; i ++) {
			System.out.print(i + " ");
			Q = i * i;
			System.out.print(Q + " ");
			C = i * i * i;
			System.out.print(C + " ");
			System.out.println("\n");
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
