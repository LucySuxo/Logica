package estruturasequencial;

import java.util.Scanner;

public class AulaIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine(); //para ler um texto inteiro até a quebra de linha
		s2 = sc.nextLine();//se você não usar o nextLine irá ler só a primeira palavra
		s3 = sc.next();//<<<exemplo esse
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//------------------
		int a;
		String a1, a2 ,a3;
		
		a = sc.nextInt();
		sc.nextLine(); //irá consumir o espaço da quebra de linha do nextInt
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();
		
		System.out.println("o QUE VOCE DIGITOU: ");
		//Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linah fica "pendente"
		//na entrada padrão. Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine()
		//Solução:
		//Faça um nextLine() extra antes de fazer o nextLine() do seu interesse
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		sc.close();
		
	}

}
