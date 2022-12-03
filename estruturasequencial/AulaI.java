package estruturasequencial;

import java.util.Locale;

public class AulaI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá mundo");  //quebra de linha
		
		System.out.print("Bom Dia!"); //sem quebra de linha

		System.out.println(); //atalho: sysout + ctnl + espaço
		
		
		int y = 32; //variavel declarada e inicializada, criada uma caixinha na memoria com o valor 32
		
		double x = 10.35784;
		
		System.out.println(y); //para chamar essa caixinha da memoria
		
		System.out.println(x );
		
		System.out.printf(""); //f é abreviação de formatado, vai imprimir na tela algo formatado
		
		System.out.printf("%.2f%n", x); //%.2f = indica que quer delimitar duas casas decimais // %n é a quebra de linha ou \n  //concatenou com a variavel x
		
		System.out.printf("%.4f%n", x); //%.4f = indica que quer delimitar quatro casas decimais
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.2f%n", x); //após configurar o locale, essa próxima impressão da tela terá o ponto flutuante como PONTO e não virgula
		
		System.out.println("RESULTADO = " + x + " METROS"); //Println = Concatenar com frase se usa o +
		
		System.out.printf("RESULTADO = %.2f metros%n", x); //%.2f será substituito pelo x
		
		//--------------------------------------------------------------------------
		//MARCADORES:
		//%f = ponto flutuantes
		//%d = inteiro
		//%s = texto
       //%n = quebra de linha
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		//só pode usar a impressão formatada = system.out.printf para usar esses elementos
		System.out.printf("%s tem %d anos e recebe: %.2f reais de salário%n", nome, idade, renda); //printf = concatena com virgula, na ordem que estiver escrito a frase
	}

}
