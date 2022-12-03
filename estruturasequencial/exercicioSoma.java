package estruturasequencial;

import java.util.Scanner;

public class exercicioSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		int a , b, resultado;
		
		System.out.println("Digite o primeiro número:");
		a = sc.nextInt();
		System.out.println("Digite o segundo número:");
		b  = sc.nextInt();
		
		resultado = a + b;
		
		System.out.println("O resultado dessa soma é: " + resultado);
		
		
		
		
		
		
		sc.close();
	}

}
