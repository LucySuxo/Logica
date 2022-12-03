package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicioEquação {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
         double A,B,C,pi = 3.14158, triangulo, circulo,trapezio,quadrado,retangulo;
         
         System.out.println("insira o numero A: ");
         A = sc.nextDouble();
         System.out.println("insira o numero B: ");
		 B = sc.nextDouble();
         System.out.println("insira o numero B: ");
         C = sc.nextDouble();
        		 
         triangulo = A * C / 2;
         circulo = pi * Math.pow(C, 2);
         trapezio = (A + B) * C / 2.0;
         quadrado = Math.pow(B, 2);
         retangulo = A * B;
         
         System.out.printf("triangulo: %.3f%n", triangulo);
         System.out.printf("circulo: %.3f%n",circulo);
         System.out.printf("trapezio: %.3f%n",trapezio);	 
         System.out.printf("quadrado: %.3f%n",quadrado);
         System.out.printf("retangulo: %.3f%n",retangulo);
		sc.close();
	}

}
