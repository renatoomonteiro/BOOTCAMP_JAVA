
public class Calculadora {

	private double n1, n2;
	private char operacao;

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

	// Métodos aritiméticos
	public double somar(double n1, double n2) {
		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public double multiplicar(double n1, double n2){
		return n1 * n2;
}

	public double dividir(double n1, double n2){
		return n1 / n2;
}
	
}
