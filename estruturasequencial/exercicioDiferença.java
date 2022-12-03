package estruturasequencial;

import java.util.Scanner;

public class exercicioDiferença {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, diferenca;
		
		System.out.println("Digite o valor do A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor do B: ");
		B = sc.nextInt();
		System.out.println("Digite o valor do C: ");
		C = sc.nextInt();
		System.out.println("Digite o valor do D: ");
		D = sc.nextInt();
		
		diferenca = (A*B - C* D);
		
		System.out.println(diferenca);
		
		sc.close();

	}

}
