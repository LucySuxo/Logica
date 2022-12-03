package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVIV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double basico=50.0, gasto=0;
		int minutos;
		
		
		System.out.println("Digite a quantidade de minutos gastos:");
		minutos = sc.nextInt();
		
		System.out.println("VALOR DE CONSUMO: ");
		
		if (minutos <= 100) {
		  System.out.printf("O valor é %.2f%n", basico);
		}else if (minutos != 100){
			gasto = (minutos - 100) * 2 + 50.0;
			System.out.printf("O gasto foi de: %.2f%n", gasto);
		}
		
		
		
         sc.close();
	}

}
