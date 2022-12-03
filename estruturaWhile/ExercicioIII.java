package estruturaWhile;
import java.util.Scanner;

public class ExercicioIII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, clientes1=0, clientes2 = 0, clientes3 = 0;
		
		System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
		number = sc.nextInt();
		
		while (number != 4) {
			if(number == 1) {
				clientes1 += 1;
				System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
				number = sc.nextInt();
			}else if (number == 2) {
				clientes2 += 1;
				System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
				number = sc.nextInt();
			}else if (number ==3) {
				clientes3 +=1;
				System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
				number = sc.nextInt();
			}else if (number >=5) {
				System.out.println("Código inválido!");
				System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
				number = sc.nextInt();
			}else if (number <=0) {
				System.out.println("Código inválido!");
				System.out.println("Digite o seu número de preferencia: \n1-Alcool \n2-Gasolina \n3-Diesel \n4-Fim");
				number = sc.nextInt();
			}
			
		}
		System.out.println("\nMUITO OBRIGADO!\n");
		System.out.printf("%nRESULTADO: %nAlcool: %d %nGasolina: %d %nDiesel: %d", clientes1, clientes2, clientes3);
		
		
		sc.close();

	}

}
