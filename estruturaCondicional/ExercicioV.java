package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Double valor;
		
		System.out.println("Insira um valor para saber em qual intervalo ele corresponde: ");
		valor = sc.nextDouble();
		
		if(valor > 25.0 && valor <=50.0) {
			System.out.println("Intervalo (25,50]"); //não esquecer da endendação
		}else if(valor >=0.0 && valor<=25.0) {
			System.out.println("Intervalo (0,25]");
		}else if(valor >=75.0 && valor<=100.0) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora do intervalo");
		}
				
				
				
				
				
				
				
				
				sc.close();
		

	}

}
