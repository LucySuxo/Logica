package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		System.out.println("Iremos calcular seu plano cartesiano a partir das suas coordenadas!");
		System.out.println("Digite o valor do X: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor do Y: ");
		y = sc.nextDouble();
		
		if(x > 0.0 && y > 0.0) {
			System.out.println("Pertence ao espaço Q1"); //endendação se chama o espaço
		}else if(x > 0.0 && y < -0.0){
			System.out.println("Pertence ao espaço Q4"); //endendação se chama o espaço
		}else if (x < 0.0 && y > 0.0) {
			System.out.println("Pertence ao espaço Q2");
		}else if (x < 0.0 && y < 0.0) {
			System.out.println("Pertence ao espaço Q3");
		}else {
			System.out.println("Pertence ao ponto de Origem");
		}
		
		
		
		
		sc.close();

	}

}
