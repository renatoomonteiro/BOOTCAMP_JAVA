import java.util.Scanner;
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
		
		char resp;
		int opcao = 0;
		
		String nomeTarefa = "", descTarefa = "", tarefaEDesc = "";
		
		Scanner input = new Scanner(System.in);
		
		Tarefas criadorDetarefas = new Tarefas(nomeTarefa, descTarefa);
		
		
		
		//Executa a saudação apenas no início do programa
		System.out.println("Seja bem vindo ao Criador de Tarefas!\n");
		
		//Início do while
		/*------------------------------------------------------------------------*/
		while(opcao != 6) {
			
			
			System.out.println("1 - Adicionar Tarefa\n" + 
							   "2 - Remover Tarefa\n" + 
							   "3 - Listar Tarefas\n" +
							   "4 - Listar em ordem alfabética\n" + 
							   "5 - Listar em ordem cronológica (Em breve)\n" + 
							   "6 - Sair\n");
			opcao = input.nextInt();
			input.nextLine();
			
			
			
			//Início do switch
			/*------------------------------------------------------------------------*/
			
			switch(opcao) {
				case 1:
					// Opção 1
					// Adicionar Terefas (verificar se a tarefa já existe antes de adicioná-la)
					System.out.println("\nInforme o nome da tarefa que deseja inserir: \n");
					nomeTarefa = input.nextLine();
					
					System.out.println("\nDescreva a tarefa: \n");
					descTarefa = input.nextLine();
					
					if(criadorDetarefas.listaDeTarefas.contains(nomeTarefa)) {
						System.out.println("\nJá há uma tarefa com esse nome\nRevise e tente novamente!\n");
						System.out.println("Tarefas: " + nomeTarefa + "\n");
						
					} 
					
					if (criadorDetarefas.listaDeTarefas.contains(descTarefa)){
						System.out.println("\nJá há uma tarefa com essa descrição\nRevise e tente novamente!\n");
						System.out.println("Tarefas: " + descTarefa + "\n");
						
					} else {
						tarefaEDesc = ("Tarefa: " + nomeTarefa + "  \nDescrição: " + descTarefa + "\n");
						criadorDetarefas.listaDeTarefas.add(tarefaEDesc);						
						
						System.out.println("\nVocê informou a tarefa: " + nomeTarefa + 
						 		  		   "\nCom a seguinte descrição: " + descTarefa + "\n");
						
						
						
						
						
					} 
					
					break;
					
				case 2:
					// Opção 2
					// Remover Tarefa (Pedir confirmação para efetuar a remoção);
					if(criadorDetarefas.listaDeTarefas.isEmpty()) {
						System.out.println("Ná há tarefas a serem removidas\nInsira alguma e tente novamente\n");
						
					} else {
						System.out.println("\nInforme o nome da tarefa que deseja remover: \n");
						
						for(int i = 0; i < criadorDetarefas.listaDeTarefas.size(); i++) {
							System.out.println((i+1) + " ) " + criadorDetarefas.listaDeTarefas.get(i) + "\n");
							}
						
						int indiceDaLista =Integer.parseInt(input.nextLine());
						
						criadorDetarefas.listaDeTarefas.remove(indiceDaLista-1);
						
						for(int i = 0; i < criadorDetarefas.listaDeTarefas.size(); i++) {
							System.out.println((i+1) + " ) " + criadorDetarefas.listaDeTarefas.get(i) + "\n");
							}
						
//						if(!criadorDetarefas.listaDeTarefas.contains(nomeTarefa) ||
//								!criadorDetarefas.listaDeTarefas.contains(descTarefa) ||
//									!criadorDetarefas.listaDeTarefas.contains(tarefaEDesc)) {
//							System.out.println("\nNome de tarefa não encontrado\nVerifique o nome e tente novamente\n");
//						} else {
							System.out.println("\nTem certeza que deseja remover a tarefa: " + nomeTarefa +
												"?\nSim = S\nNão = N\n");
							 					resp = input.next().charAt(0);
							 

							if (resp == 'S' || resp == 's') {
								criadorDetarefas.listaDeTarefas.remove(nomeTarefa);
								criadorDetarefas.listaDeTarefas.remove(descTarefa);
								System.out.println("\nTarefa removida com sucesso!\n");
								
							} else if (resp == 'N' || resp == 'n') {
								System.out.println("\nFim do programa\n");
								
							} else {
								System.out.println("\nOpção inválida!\n");
							}

						//}
						}
					System.out.println();
					break;
				case 3:
					// Opção 3
					// Listar Tarefas;
					
					if(criadorDetarefas.listaDeTarefas.isEmpty()) {
						System.out.println("Ná há tarefas a serem exibidas\nInsira alguma e tente novamente\n");
					}else {
					System.out.println("Tarefas:");
					for(int i = 0; i < criadorDetarefas.listaDeTarefas.size(); i++) {
						System.out.println((i + 1) + ") " + criadorDetarefas.listaDeTarefas.get(i) + "\n");
						}
					}
					break;
				case 4:
					//Opção 4
					// Listar em ordem alfabética;
					System.out.println();
					break;
				case 5:
					//Opção 5
					// Listar em ordem cronológica
					System.out.println();
					break;
				case 6:
					System.out.println("\nFim do programa!");
					break;
				default:
					System.out.println("Opção inválida!\nTente de 1 a 6\n");
				
			}
			
			//Fim do switch
			/*------------------------------------------------------------------------*/
			
		}
		
		input.close();
		//Fim do while
		/*------------------------------------------------------------------------*/
	}

}
