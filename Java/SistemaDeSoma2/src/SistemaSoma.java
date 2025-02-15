import java.util.Scanner;
public class SistemaSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int valor1, valor2;
		
		//Entrada de dados
		System.out.println("Insira o primeiro valor: ");
		valor1 = input.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		valor2 = input.nextInt();
		
		//Processamento de dados
		
		int resultado = valor1 + valor2;
				
		//Saída de dados
		System.out.println("O resultado da soma de " + valor1 + " + " + valor2 + " = " + resultado );
		
		
		//switch
		
		int diaDaSemana = 2;
		switch(diaDaSemana) 
		{
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		default:
			System.out.println("Dia inválido!");
		}
		
		if(valor1 > valor2){
			System.out.println(valor1 + " é maior que " + valor2);
		}
		else if(valor2 > valor1) 
		{
			System.out.println(valor2 + " é maior que " + valor1);
		}
		else {
			System.out.println(valor1 + " == " + valor2);
		}
	}
}
