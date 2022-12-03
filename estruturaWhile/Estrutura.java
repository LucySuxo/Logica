package estruturaWhile;
import java.util.Scanner;

public class Estrutura {

	public static void main(String[] args) {
		// Enquanto = while
		
		Scanner sc = new Scanner(System.in);
		
        int numbers, some =0;
        
        System.out.println("Digite um número inteiro: ");
        numbers = sc.nextInt();
        
        while(numbers != 0) {
        	some = numbers + some; //metodo
        	numbers = sc.nextInt();
        	
        	
        }
        System.out.println("Soma: " + some);
        
        
        
        
        sc.close();
	}

}
