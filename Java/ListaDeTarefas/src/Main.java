import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Collections;

public class Main {
	/* Enunciado
	 * Crie uma Lista de Tarefas
	 * Crie uma aplicação que tenha pelo menos uma classe Principal e uma classe Tarefa. 
	 * As tarefas devem ser armazenadas em um ArrayList. 
	 * Você deve seguir os seguintes requisitos:
	 * As propriedades devem estar encapsuladas;
	 * Na Aplicação Main, ter um menu com pelo menos as seguintes opções: Adicionar Terefas 
	 * (verificar se a tarefa já existe antes de adicioná-la); 
	 * Remover Tarefa (Pedir confirmação para efetuar a remoção);
	 * Listar Tarefas; 
	 * Listar em ordem alfabética; 
	 * Listar em ordem cronológica
	 * Na aplicação Main terá um ArrayList de Tarefa?
	 * ou uma Classe ListaDeTarefas com um ArrayList?
	 */
	public static void main(String[] args) {
		
		//Variáveis
		String nomeDaTarefa="";
		char resp;
		
		//As opções vão de 1 a 5, o 6 encerrará a aplicação
		int opcao = 0;

		//Lista que receberá as tarefas e que será possível adicionar; remover; listar; exibir em ordem alfabética; exibir em ordem cronológica
		ArrayList<String> listaTarefas = new ArrayList<>();
		
		//Método de entrada de dados input, para capturar o nome das tarefas 
		Scanner input = new Scanner(System.in);
		
		//Criação do método construtor, responsável por acionar os métodos da classe Tarefas
		Tarefas criadorDeTarefas = new Tarefas(nomeDaTarefa, opcao, listaTarefas);
		
		//criadorDeTarefas.crudTarefa(nomeDaTarefa, opcao);
		
		// while para exibir as opções referentes às tarefas
		
		System.out.println("Bem vindo à Lista de Tarefas\n");

		while (opcao != 6) {
			System.out.println("1 - Adicionar Tarefa\n" + "2 - Remover Tarefa\n" + "3 - Listar Tarefas\n"
					+ "4 - Listar em ordem alfabética\n" + "5 - Listar em ordem cronológica (Em breve)\n" + "6 - Sair\n");
			opcao = input.nextInt();
			input.nextLine();
			
			// Opção 1
			// Adicionar Terefas (verificar se a tarefa já existe antes de adicioná-la)
			if (opcao == 1) {
				System.out.println("Insira o nome da tarefa: \n");

				nomeDaTarefa = input.nextLine();
				
				//listaTarefas.add(nomeDaTarefa.toString());
				
				//criadorDeTarefas.addTarefa(nomeDaTarefa.toString());
				
				criadorDeTarefas.crudTarefa(nomeDaTarefa, opcao);
				//
				// listaTarefas.add( new String(nomeDaTarefa));
				// System.out.println(listaTarefas);

				
				
				// Opção 2
				// Remover Tarefa (Pedir confirmação para efetuar a remoção);
			} else if (opcao == 2) {
				//input.nextLine();
				if(listaTarefas.isEmpty()) {
					System.out.println("Ná há tarefas a serem removidas\nInsira alguma e tente novamente\n");
				} else {
					System.out.println("\nInforme o nome da tarefa que deseja remover: \n");
					
					nomeDaTarefa = input.nextLine();;
					

					// Pegar o índice da tarefa que quero remover
					//int indice = listaTarefas.indexOf(nomeDaTarefa);

					// indice != listaTarefas.indexOf(nomeDaTarefa)
					// Verificar se o nome da tarefa que deseja remover, está na lista
					
					if (!listaTarefas.contains(nomeDaTarefa)) {
						System.out.println("\nNome de tarefa não encontrado\nVerifique o nome e tente novamente\n");
					} else {
						System.out.println(
								"\nTem certeza que deseja remover a tarefa: " + nomeDaTarefa + "?\nSim = S\nNão = N\n");
						 resp = input.next().charAt(0);
						 

						if (resp == 'S' || resp == 's') {
							criadorDeTarefas.crudTarefa(nomeDaTarefa, opcao);
							
							//listaTarefas.remove(nomeDaTarefa);
							System.out.println("\nTarefa removida com sucesso!\n");
						} else if (resp == 'N' || resp == 'n') {
							System.out.println("\nFim do programa\n");
						} else {
							System.out.println("\nOpção inválida!\n");
						}
					}

					System.out.println(listaTarefas);
				}
				
				
			} 
			
			// Opção 3
			// Listar Tarefas;
		
			else if (opcao == 3) {
				if (listaTarefas.isEmpty()) {
					System.out.println("Ainda não há tarefas a serem exibidas\nInsira alguma e tente novamente\n");
				} else {
					criadorDeTarefas.listarTarefas1(listaTarefas);
					
					//criadorDeTarefas.getListaTarefas();
					
					//criadorDeTarefas.crudTarefa(nomeDaTarefa, opcao);
					
					System.out.println("Tarefas " + listaTarefas + "\n");
				}
			}
			
			// Listar em ordem alfabética;
			else if (opcao == 4) {
				if (listaTarefas.isEmpty()) {
					System.out.println("\nAinda não há tarefas a serem exibidas em ordem alfabética\n");
				} else {
					//Collections.sort(listaTarefas);
					criadorDeTarefas.listarAlfabetica(listaTarefas);
					System.out.println("Lista ordenada " + listaTarefas + "\n");
				}
			}

			// Listar em ordem cronológica
			else if (opcao == 5) {
				
				if (listaTarefas.isEmpty()) {
					System.out.println("\nAinda não há tarefas a serem exibidas em ordem cronológica" +
												"\nInsira alguma e tente novamente\n");
				} else {
					criadorDeTarefas.listarTarefas1(listaTarefas);
					
					//criadorDeTarefas.getListaTarefas();
					
					//criadorDeTarefas.crudTarefa(nomeDaTarefa, opcao);
					
					System.out.println("Tarefas em ordem cronológica " + listaTarefas);
				}
				
			}
			
			
			else if (opcao == 6) {
				System.out.println("Fim do programa!");
			} else {
				System.out.println("Opção inválida!\nTente de 1 a 6\n");
			}
//Teste commit em 18/02/2025
		}

	}
}
