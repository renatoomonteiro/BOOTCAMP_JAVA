import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
		Tarefas criadorDeTarefas = new Tarefas(nomeDaTarefa, opcao);
		
		
		// while para exibir as opções referentes às tarefas
		
		while(opcao != 6) {
			System.out.println("1 - Adicionar Tarefa\n" + 
					   "2 - Remover Tarefa\n" + 
					   "3 - Listar Tarefas\n" + 
					   "4 - Listar em ordem alfabética\n" + 
					   "5 - Listar em ordem cronológica\n" +
					   "6 - Sair\n");
	opcao = input.nextInt();	
	
	//Opção 1
	//Adicionar Terefas (verificar se a tarefa já existe antes de adicioná-la)
	if(opcao == 1) {				
		System.out.println("Insira o nome da tarefa: \n");
		
		nomeDaTarefa = input.next();
		listaTarefas.add(nomeDaTarefa.toString());
		//
		//listaTarefas.add( new  String(nomeDaTarefa));
		//System.out.println(listaTarefas);
		
		//Opção 2
		//Remover Tarefa (Pedir confirmação para efetuar a remoção);	
	} else if(opcao == 2) {
		System.out.println("\nInforme o nome da tarefa que deseja remover: \n");
		nomeDaTarefa = input.next();
		
		//Pegar o índice da tarefa que quero remover
		int indice = listaTarefas.indexOf(nomeDaTarefa);
		
		//indice != listaTarefas.indexOf(nomeDaTarefa)
		//Verificar se o nome da tarefa que deseja remover, está na lista
		if(!listaTarefas.contains(nomeDaTarefa))   {
			System.out.println("\nNome de tarefa não encontrado\n");
		} else {
			System.out.println("\nTem certeza que deseja remover a tarefa: " + nomeDaTarefa + "?\nSim = S\nNão = N\n");
			resp = input.next().charAt(0);
			
			if(resp == 'S' || resp == 's') {
				listaTarefas.remove(nomeDaTarefa);
				System.out.println("\nTarefa removida com sucesso!\nFim do programa\n");
			} else if(resp == 'N' || resp == 'n'){
				System.out.println("\nFim do programa\n");
			} else {
				System.out.println("\nOpção inválida!\n");
			}
		}
			
		System.out.println(listaTarefas);
	//Opção 3
	//Listar Tarefas; 
	} else if(opcao == 3) {
		System.out.println("Tarefas" + listaTarefas);
		
	}
	//Listar em ordem alfabética;
	else if(opcao == 4) {
		Collections.sort(listaTarefas);
		System.out.println("Lista ordenada " + listaTarefas + "\n");
	}
	
	//Listar em ordem cronológica
	else if(opcao ==5) {
		System.out.println("Tarefas " + listaTarefas + "\n");
	}
	else {
		System.out.println("Opção inválida!");
	}
		}	
		 

			
		
			//Teste
			System.out.println(listaTarefas);
		
		}
	}
