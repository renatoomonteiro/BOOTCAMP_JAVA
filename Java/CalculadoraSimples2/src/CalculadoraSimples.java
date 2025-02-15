import java.util.Scanner;
public class CalculadoraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, resultado;
		char operacao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		n1 = input.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		n2 = input.nextInt();
		
		System.out.println("Informe a operação que deseja realizar:\nAdição: +\nSubtração: -\n"
				+ "Divisão: /\nMultiplicação: *");
		operacao = input.next().charAt(0);
		
		switch(operacao) 
		{
		case '+':
			resultado = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resultado);
			break;
		case '*':
			resultado = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + resultado);
			break;
		case '-':
			resultado = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + resultado);
			break;
		case '/':
			resultado = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + resultado);
			break;
		default:		
			System.out.println("Operação inválida!");
		}
		
	}

}
