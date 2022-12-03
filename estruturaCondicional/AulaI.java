package estruturaCondicional;

import java.util.Scanner;

public class AulaI {

	public static void main(String[] args) {
		
       //ESTRUTURA CONDICIONAL OU ESTRUTURA DE CONTROLE
		
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora<12) {
					System.out.println("Bom dia");//dar espaço é endendação
		}  //sempre reparar na endendação
		else {
	             	System.out.println("Boa tarde"); 
		
		}

		
		sc.close();
	}

}
