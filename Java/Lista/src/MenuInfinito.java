import java.util.Scanner;
import java.util.ArrayList;
public class MenuInfinito {

	public static void main(String[] args) {
		// Criando um MENU infinito
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		//while infinito
		while(true) {
			System.out.println("1 - Depósito\n"+
								"2 - Saldo\n" +
								"3 - Sair");
			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println("Depósito");
				break;
			case 2:
				System.out.println("Saldo");
				break;
			case 3:
				System.out.println("Programa finalizado");			
			}
			//condição de saída:
			if(opcao == 3)
				break;
		}
	}

}
