package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class AulaIII {

	public static void main(String[] args) {
		// Entrada de dados
		
		
		Locale.setDefault(Locale.US);//PARA PODER DIGITAR COM PONTO O LOCALE PRECISA ESTAR ANTES QUE O SCANNER
		//Para fazer entrada de dados, precisa criar um objeto do tipo scanner da seguinte forma:
		Scanner sc = new Scanner(System.in);
	    
		String x;
		
		x = sc.next();//vai entrar na variavel x o que for escrito e lido no sc.next()
		
		System.out.println("Voce digitou: " + x);
		
				
		//quando não precisar mais usar o objeto sc é preciso fechar/encerrar:
		
	
      //--------
		int a;
		
		a = sc.nextInt();
		
		System.out.println("Voce digitou o número: " + a);
		
		//---------------------------------------------
		
		double b;
			
		b = sc.nextDouble();
	
		System.out.printf("Voce digitou o valor: %.2f%n", b); 
		
		//------------------------------
		double c; //PARA DIGITAR COM VIRGULA, NÃO USAR O LOCALE.SETDEFAULT(LOCALE.US)
		
		c = sc.nextDouble();
		
		System.out.println("O valor que você digitou foi:" + c); //vai ter só uma casa deicmal depois do ponto
		
		//---------------------
		//PARA LER UM CARACTERE:
		
		char d;
		
		d = sc.next().charAt(0);//charAt(0) pega o primeiro caractere do seu string, charAt(1) = pega o segundo caractere e assim por diante
		
		System.out.println("O primeiro caractere é :" + d);
		
		//-----------------------------
		//Para ler varios dados na mesma linha
		//INT = sc.nextInt();
		//String = sc.next();
		//Double = sc.nextDouble();
		//char = sc.next().charAt(0);
		
		String l;
		int m;
		double n;
		
		l = sc.next();
		m = sc.nextInt();
		n = sc.nextDouble();
		System.out.println("Dados digitados: " );
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		
		
		
		
		sc.close();
	}

}
