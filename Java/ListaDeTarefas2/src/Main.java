import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao = -1;

		// Lista de Classe Tarefa. O elemento dentro do < > deverá ser uma classe
		ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

		System.out.println("Bem vindo ao criador de tarefas!\n");
		
		while (opcao != 0) {
			System.out.println("1 - Adicionar Tarefa\n" + 
							   "2 - Remover Tarefa\n" + 
							   "3 - Listar Tarefa\n" + 
							   "0 - Sair");
			opcao = input.nextInt();

			switch (opcao) {
			//Inserir
			case 1:
				System.out.println("\nInsira o títudo da tarefa:");
				input = new Scanner(System.in);				
				String titulo = input.nextLine();
				
				System.out.println("\nInsira a descrição da tarefa:");
				String descricao = input.nextLine();

				// Criação da instância tarefa p/ adicionar na lista
				Tarefa tarefa = new Tarefa();

				// Setando o título e a descrição informada com os métodos set
				tarefa.setTitulo(titulo);
				tarefa.setDescricao(descricao);

				// Adicionando na lista
				listaDeTarefas.add(tarefa);

				System.out.println("\nTítulo informado: "+ tarefa.getTitulo() + 
								   "\nDescrição informada: " + tarefa.getDescricao() +"\n");
				break;
			//Remover
			case 2:
				System.out.println("\nInforme a tarefa que deseja remover (Insira o título)");
				input = new Scanner(System.in);
				titulo = input.nextLine();
				
				
				
				for(int i =0; i< listaDeTarefas.size(); i++) {
					if(titulo.equals(listaDeTarefas.get(i).getTitulo())) {
						listaDeTarefas.remove(i);
					}
				}
				
				break;
			//Listar
			case 3:
//				//Tarefa listaDeTarefas = new Tarefa();
//				for(int i=0; i<listaDeTarefas.size(); i++) {
//					System.out.println(i+1 + ") Título: "+ tarefa.getTitulo() + 
//					   		   " - Descrição: " + tarefa.getDescricao() +"\n");
//				}
				
					for(Tarefa t : listaDeTarefas) {					
							System.out.println("\n)Título: "+ t.getTitulo() + 
							   		   "\nDescrição: " + t.getDescricao() +"\n");	
						}
						
					
				
				
				
				break;
			case 0:
				System.out.println("\nFim do programa");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		}
	}

}
