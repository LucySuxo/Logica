package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, espacificacao, quantidade;
		double preco;
		
		System.out.println("Cardápio:\n 1 - Cachorro Quente - R$ 4.00  \n 2 - X-Salada - R$ 4.50 \n 3 - X-Bacon - R$ 5.00 \n 4 - Torrada Simples - R$ 2.00 \n 5 - Refrigerante - R$ 1.50\n");
		System.out.println("Insira o código do seu pedido: ");
		codigo = sc.nextInt();
		System.out.println("Insira a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = quantidade * 4.00;
			System.out.printf("O total do seu pedido é R$ %.2f%n", preco);
		}else if (codigo == 2) {
			preco = quantidade * 4.50;
			System.out.printf("O total do seu pedido é R$ %.2f%n", preco);
		}else if (codigo == 3) {
			preco = quantidade * 5.00;
			System.out.printf("O total do seu pedido é R$ %.2f%n", preco);
		}else if (codigo == 4) {
			preco = quantidade * 2.00;
			System.out.printf("O total do seu pedido é R$ %.2f%n", preco);
		}else if (codigo == 5) {
			preco = quantidade * 1.50;
			System.out.printf("O total do seu pedido é R$ %.2f%n", preco);
		}else {
			System.out.println("Esse código não pertence ao menu! Tente novamente!");
		}
		
		

	}

}
