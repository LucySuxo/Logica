package estruturasequencial;

public class AulaII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		
		x = 5; //X recebe 5
		
		y = 2 * x; //O resultado do calculos era armazenada na variavel y
		
		System.out.println(x);
		System.out.println(y);
		
		//------------------
		int a;
		double b;
		
		a = 5;
		b = 2 * a;
		
		System.out.println(a);
		System.out.println(b); //vai imprimir com .0 porque o b é do tipo double
		
		//----------------
		
		double h, c, C, area; //quando se usa DOUBLE é indicado que sempre use o .0 no final de cada número
		
		//para FLOAT use f sempre no final de cada número
		/*float c, C, h;
		 * c = 6f;
		 * C = 8f;
		 * h = 5f;
		 * 
		 * area = (c + C) /2f * h;
		 * 
		 * System.out.println(area);
		 * */
		
		c = 6.0;
		C = 8.0;
		h = 5.0;
		
		area = (c + C) / 2.0 * h ;
		
		System.out.println(area);
		
		
		//-------------------
	    int l, m;
	    double resultado;
	    
	     l = 5;
	     m = 2;
	     
	     resultado = l / m;
	     
	     System.out.println(resultado); //a impressão foi número inteiro (2 em double)porque os dois números que foram atribuidos eram inteiros, mesmo sendo double a variavel resposta
	     //para o resultado ser 2,5 é preciso colocar assim: 
	     resultado = (double) l / m;
	     System.out.println(resultado); //a divisão será 2.5
	     
	     //----------
	     
	     double f;
	     int d;
	     
	     f = 5.0;
	     d = (int)f; //(int) diz ao compilador que nao quer as cadas decimais
	     
	     System.out.println(d);
	     
	     //casting: conversão explicita de tipos de dados
	     
	     
	     
	     
	     
		
		
		
		
		
	}

}
