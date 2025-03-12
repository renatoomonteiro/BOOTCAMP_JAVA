import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//ListaDeTarefas gerenciadorDeTarefas = new ListaDeTarefas();
		
		
		Scanner input = new Scanner(System.in);
		int opcao = -1;

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
				
				boolean existe = true;
				
				while(existe) {
					existe = false;
					for(Tarefa t : gerenciadorDeTarefas.getListaTarefas()) {
						if(titulo.equals(t.getTitulo())){
							System.out.println("\nJá existe esta tarefa!\nInsira um novo título!");
							titulo = input.nextLine();
							existe = true;
							//break p/ sair do laço
							break;
						}
					}	
				}				
				
				if(!existe) {
					
					System.out.println("\nInsira a descrição da tarefa:");
					String descricao = input.nextLine();

					// Criação da instância tarefa p/ adicionar na lista
					Tarefa tarefa = new Tarefa();

					// Setando o título e a descrição informada com os métodos set
					tarefa.setTitulo(titulo);
					tarefa.setDescricao(descricao);

					
					
					gerenciadorDeTarefas.adicionarTarefa(tarefa);
					// Adicionando na lista
					//listaDeTarefas.add(tarefa);

					System.out.println("\nTítulo informado: "+ tarefa.getTitulo() + 
									   "\nDescrição informada: " + tarefa.getDescricao() +"\n");
					break;
					
				}
				
				
			//Remover
			case 2:
				System.out.println("\nInforme a tarefa que deseja remover (Insira o título)");
				input = new Scanner(System.in);
				titulo = input.nextLine();
				
				for(Tarefa t : gerenciadorDeTarefas.getListaTarefas()) {
					if(titulo.equals(t.getTitulo())) {
						System.out.println("\nTem certeza que gostaria de remover o título " + titulo + "?\n(s/n)") ;
						char confirmar = input.next().charAt(0);
						if(confirmar == 's' || confirmar == 'S') {
							gerenciadorDeTarefas.removerTarefa(t);							
							System.out.println("\nRemovido com sucesso!");
							break;
						}else if(confirmar == 'n' || confirmar == 'N') {
							System.out.println("\nOperação Cancelada pelo usuário\n");
							break;
						}
						else {
							System.out.println("\nOpção inválida!\n");
						}
					}else {
						System.out.println("\nTarefa não encontrada!\n");
					}
				}
				
				
				
				
//				for(int i =0; i< listaDeTarefas.size(); i++) {
//					if(titulo.equals(listaDeTarefas.get(i).getTitulo())) {
//						listaDeTarefas.remove(i);
//						//Confirmar antes de remover
//					
//						System.out.println("\nRemovido com sucesso!");
//					}
//				}
				
				break;
			//Listar
			case 3:
//				//Tarefa listaDeTarefas = new Tarefa();
//				for(int i=0; i<listaDeTarefas.size(); i++) {
//					System.out.println(i+1 + ") Título: "+ tarefa.getTitulo() + 
//					   		   " - Descrição: " + tarefa.getDescricao() +"\n");
//				}
				
				if(gerenciadorDeTarefas.getListaTarefas().isEmpty()) {
					System.out.println("\nAinda não há tarefas!\nInsira alguma e tente novamente!\n");
				}else {
					for(Tarefa t : gerenciadorDeTarefas.getListaTarefas()) {					
						System.out.println("\n)Título: "+ t.getTitulo() + 
						   		   "\nDescrição: " + t.getDescricao() +"\n");	
					}
			
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
