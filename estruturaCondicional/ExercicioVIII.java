package estruturaCondicional;

import java.util.Scanner;

public class ExercicioVIII {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
            começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * 
		 * 
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		int inicial, finale, duracao;
		
		System.out.println("Digite o horario inicial: ");
		inicial = sc.nextInt();
		System.out.println("Digite o horario final: ");
		finale = sc.nextInt();
		
		if(inicial < finale) {
			duracao = finale - inicial;
		}else { //inicial > finale
			duracao = 24 - inicial + finale;
			
		}
		
		System.out.println("O jogo durou" + duracao +"hora(s)");
		
		
		
		sc.close();

	}

}
