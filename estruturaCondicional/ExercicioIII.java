package estruturaCondicional;

import java.util.Scanner;

public class ExercicioIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o primeiro número :");
		A = sc.nextInt();		
		System.out.println("Digite o segundo número :");
		B = sc.nextInt();	
		
		if (A % B == 0 || B % A == 0 ) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		//EXPLICAÇÃO: QUANDO O A E B FOREM DIVIDIDOS E A SOBRA(MODULO) FOR IGUAL QUE ZERO (INDEPENDENTE DA ORDEM DA DIVISÃO)
		//IRÁ DIZER SE É MULTIPLO OU NÃO
		//POIS NUMEROS MULTIPLOS ENTRE SI SEMPRE TEM O MODULO(RESTO) ZERO 0
		
		
		sc.close();

	}

}
