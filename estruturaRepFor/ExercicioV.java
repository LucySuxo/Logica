package estruturaRepFor;

import java.util.Scanner;

public class ExercicioV {

	public static void main(String[] args) {
		
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

		Scanner sc = new Scanner(System.in);
		
		int N, in = 0, out=0, valor;
		
		System.out.println("Digite um número que vai ser a quantidade de numeros que serão lidos: ");
		N = sc.nextInt();
		
		for(int i = 0; i < N ; i ++) {
			System.out.println("Digite seu número: ");
			valor = sc.nextInt();
			if(valor >= 10 && valor<=20) {
				in += 1;
			}else{
				out += 1;
			}
		}
		System.out.printf("Número que estão dentro do intervalo: %d in %n Número que estão fora do intervalo: %d out %n", in, out);
		
		
		
		sc.close();
	}

}
