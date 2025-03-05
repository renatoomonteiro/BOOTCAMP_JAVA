//Tratamento de Erros - try-catch

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double resultado = 0;		
		try {
			resultado = divisao(10, 0);
		}catch(DivisaoPorZeroException e) {
			//resultado = 10/e.getValorPadrao();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(resultado);
		}
		
		
	}

	//throws ArithmeticException lança uma exceção 
	private static double divisao(int valor, int denominador) throws DivisaoPorZeroException {
		double result = 0;
		
		if(denominador == 0) {
			throw new DivisaoPorZeroException("\nDivisão por zero!");
		}
		
		result = valor/denominador;
		
		return result;
	}

}
