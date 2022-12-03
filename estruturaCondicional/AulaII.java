package estruturaCondicional;

import java.util.Scanner;

public class AulaII {

	public static void main(String[] args) {
		
		//ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS
		
		Scanner sc = new Scanner(System.in);
		

		int hora;
		
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora<12) {
		   System.out.println("Bom dia");//dar espaço é endendação
		}  //sempre reparar na endendação
		else if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde");
		}
		else { //else nunca tem condição
			System.out.println("Boa noite");
		}
			
			
		
	     
		sc.close();
		
		
		

	}

}
