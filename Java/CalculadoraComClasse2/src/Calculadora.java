
public class Calculadora {
	private double n1, n2;
	private char operacao;

	// Método construtor da classe Calculadora
	public Calculadora(double n1, double n2, char operacao) {
		this.n1 = n1;
		this.n2 = n2;
		this.operacao = operacao;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public char getOperacao() {
		return operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}

	// Métodos privados com os cálculos aritiméticos
	private double somar(double n1, double n2) {
		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public double dividir(double n1, double n2) {
		return n1 / n2;
	}

	// Método público para chamar os métodos privados com os valores que serão
	// calculados.
	public double calcular(double n1, double n2, char operador) {
		// variável que chamará os métodos privados
		double resultado = 0;

		if (operador == '+') { 
			resultado = somar(n1, n2);
		} else if (operador == '-') {
			resultado = subtrair(n1, n2);
		} else if (operador == '*') {
			resultado = multiplicar(n1, n2);
		} else if (operador == '/') {
			resultado = dividir(n1, n2);
		}
		// retorno  
		return resultado; 
	} 
	// Não esquecer de fazer o commit!  
}
