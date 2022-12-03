package estruturaRepFor;

import java.util.Scanner;

public class ExercicioVII {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int N;
		double P1,P2;
		double R =0 ;
		
		System.out.println("Digite a quantidade de pares que deseja ter: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N ; i ++) {
				System.out.println("Digite o primeiro par:");
				P1 = sc.nextInt();
				System.out.println("Digite o segundo par:");
				P2 = sc.nextInt();
				if (P2 != 0) {
					R = P1 / P2;
					System.out.println("Resultado" + R);
				}else  {
					System.out.println("divisão impossivel");
				}
					
		}
		
		
		
		
		
		sc.close();
		

	}

}
