package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicioPecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String codigo1, codigo2;
		int quantidade1, quantidade2;
		double valor1, valor2, pagar1, pagar2, total;
		
		System.out.println("Insira o codigo da peça: ");
		codigo1 = sc.next();
		System.out.println("Insira a quantidade de peças: ");
		quantidade1 = sc.nextInt();
		System.out.println("Insira o valor unitário da peça: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Insira o codigo da peça: ");
		codigo2 = sc.next();
		System.out.println("Insira a quantidade de peças: ");
		quantidade2 = sc.nextInt();
		System.out.println("Insira o valor unitário da peça: ");
		valor2 = sc.nextDouble();
		
		pagar1 = quantidade1 * valor1;
		pagar2 = quantidade2 * valor2;
		
		total = pagar1 + pagar2;

		
		System.out.printf("Valor a pagar %.2f", total);

		
		sc.close();
		

	}

}
