package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicioRaio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double area, pi = 3.14159, raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		
		raio = sc.nextDouble();
		
		area = (pi * (Math.pow(raio, 2)));
		
        System.out.printf("O valor desse calculo é %.4f%n", area);
        
        sc.close();
	}

}
