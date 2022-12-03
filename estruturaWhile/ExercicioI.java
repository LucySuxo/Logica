package estruturaWhile;
import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
       int number;
       
       System.out.println("Digite uma senha: ");
       number = sc.nextInt();
       
       while(number != 2002) {
    	   System.out.println("Senha inválida! Tente novamente");
    	   number = sc.nextInt();
       }
		
		System.out.println("Acesso permitido!");
		
		
		
		
		sc.close();
	}

}
