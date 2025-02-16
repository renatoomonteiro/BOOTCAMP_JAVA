import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	/*
	 * Crie uma Lista de Tarefas Crie uma aplicação que tenha pelo menos uma classe
	 * Principal e uma classe Tarefa. As tarefas devem ser armazenadas em um
	 * ArrayList. Você deve seguir os seguintes requisitos:
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Menu

		// Criando um MENU infinito

		Scanner input = new Scanner(System.in);

		int opcao = 0;
		// while infinito
		while (opcao != 6) {
			System.out.println("1 - Adicionar Tarefa\n" + 
							   "2 - Remover Tarefa\n" + 
							   "3 - Listar Tarefas\n" + 
							   "4 - Listar em ordem alfabética\n" + 
							   "5 - Listar em ordem cronológica\n" +
							   "6 - Sair\n");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nAdicionar Tarefa\n");
				break;
			case 2:
				System.out.println("\nRemover Tarefa\n");
				break;
			case 3:
				System.out.println("\nListar Tarefas\n");
				break;
			case 4:
				System.out.println("\nListar em ordem alfabética\n");
				break;
			case 5:
				System.out.println("\nListar em ordem cronológica\n");
				break;
			case 6:
				System.out.println("\nFim do programa\n");
			}
		}

	}

}
