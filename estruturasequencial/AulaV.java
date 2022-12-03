package estruturasequencial;

public class AulaV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FUNÇÕES MATEMÁTICAS:
		
		//A = Math.sqrt(x); -> variavel A recebe a raiz quadrada de x
		//A = Math.pow(x, y); -> variavel A recebe o resultado de x elevado a y
		//A = Math.abs(x); -> variavel A recebe o valor absoluto de x (absoluto = valor sem negativo, caso exista negativo)
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A); 
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C); 
		
		
		A = Math.pow(x,  y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0,  2.0);
		System.out.println(x + "elevado a " + y + "é = " + A);
		System.out.println(x + "elevado a 2.0 é = " + B);
		System.out.println("5.0 elevado a 2.0 é = " + C);
		
		//Valor absoluto é tirar o número negativo se tiver
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + "é = " + A);
		System.out.println("Valor absoluto de " + z + "é = " + B);
		
		//Fazendo equação de baaskara
		
		int b = -4;
		int a = 2;
		int c = 3;
		
		double delta;
		double resultado1;
		double resultado2;
		
		delta = ((Math.pow(b, 2) - 4) * a * c);
		
		resultado1 = (b + Math.sqrt(delta)) / (2 * a);
		resultado2 = (b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println(resultado1);
	    System.out.println(resultado2);
		
	    /*delta = Math.pow(b, 2.0) = 4*a*c;
	     * X1 = (-b + Math.sqrt(delta) / (2.0 * a);
	     * x1 = (-b - Math.sqrt(delta) / (2.0 * a);
	     * estudar: java.lang.Math
	     * 
	     * 
	     * */
		
		

	}

}
