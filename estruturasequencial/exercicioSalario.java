package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSalario {

	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int id, horas;
		double salario, total;
		
		System.out.println("Digite o ID do funcionario: ");
		id = sc.nextInt();
		System.out.println("Digite as horas de trabalho do funcionario: ");
		horas = sc.nextInt();
		
		System.out.println("Valor que recebe por hora: ");
		salario = sc.nextDouble();
		total = horas * salario;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", id,  total);
		
		
		sc.close();

	}

}
