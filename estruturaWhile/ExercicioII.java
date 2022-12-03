package estruturaWhile;
import java.util.Scanner;

public class ExercicioII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number1, number2, resultado;
		
		System.out.println("Digite o número do plano horizonal: ");
		number1 = sc.nextInt();
		System.out.println("Digite o número do plano vertical: ");
		number2 = sc.nextInt();
		
		while(number1 != 0 && number2 != 0) {
			if (number1  > 0 && number2 > 0 ) {
				System.out.println("É o primeiro do plano cartesiano");
			}else if (number1 < 0 && number2 > 0) {
				System.out.println("É o segundo do plano cartesiano");
			}else if (number1 < 0 && number2 < 0) {
				System.out.println("É o terceiro do plano cartesiano");
			}else if (number1 > 0 && number2 < 0) {
				System.out.println("É o quarto do plano cartesiano");
			}	
			System.out.println("Digite o número do plano horizonal: ");
			number1 = sc.nextInt(); //pedir para recolocar o numero e não dar um looping
			System.out.println("Digite o número do plano vertical: ");
			number2 = sc.nextInt(); //pedir para recolocar o numero e não dar o lopping
		}
		   System.out.println("NULO");
		
		
		
	}

}
