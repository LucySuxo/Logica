package estruturaCondicional;

public class condicionalTernaria {

	public static void main(String[] args) {
		// condicional ternária
		
		double valor = 35.0;
		double descontinho = (valor < 20.0) ? valor * 0.1 : valor * 0.5;
		System.out.println("O valor é:" + descontinho);
	}

}
