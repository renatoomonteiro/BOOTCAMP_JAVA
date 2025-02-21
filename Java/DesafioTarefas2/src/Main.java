import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		char resp;
		int opcao = 0;

		String nomeTarefa = "", descTarefa = "", tarefaEDesc = "";

		Scanner input = new Scanner(System.in);

		OperacoesComTarefa criadorDetarefas = new OperacoesComTarefa();

		ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
		
		mock(listaDeTarefas);

		// Executa a saudação apenas no início do programa
		System.out.println("Seja bem vindo ao Criador de Tarefas!\n");

		// Início do while
		/*------------------------------------------------------------------------*/
		while (opcao != 6) {

			System.out.println("1 - Adicionar Tarefa\n" + "2 - Remover Tarefa\n" + "3 - Listar Tarefas\n"
					+ "4 - Listar em ordem alfabética\n" + "5 - Listar em ordem cronológica (Em breve)\n"
					+ "6 - Sair\n");
			opcao = input.nextInt();
			input.nextLine();

			// Início do switch
			/*------------------------------------------------------------------------*/

			switch (opcao) {
			case 1:
				// Opção 1
				// Adicionar Terefas (verificar se a tarefa já existe antes de adicioná-la)
				System.out.println("\nInforme o nome da tarefa que deseja inserir: \n");
				nomeTarefa = input.nextLine();

				System.out.println("\nDescreva a tarefa: \n");
				descTarefa = input.nextLine();

				String mensagemDeAdd = criadorDetarefas.adicionarTarefa(nomeTarefa, descTarefa, listaDeTarefas);
				System.out.println(mensagemDeAdd);

				break;

			case 2:
				// Opção 2
				// Remover Tarefa (Pedir confirmação para efetuar a remoção);

				System.out.println(criadorDetarefas.listarTarefas(listaDeTarefas));

				System.out.println("Escolha um índice para remover\n");
				int indiceDoArray = Integer.parseInt(input.nextLine());

				System.out
						.println("\nTem certeza que deseja remover a tarefa: " + listaDeTarefas.get(indiceDoArray-1).getNome() + "?\nSim = S\nNão = N\n");
				resp = input.next().charAt(0);

				if (resp == 'S' || resp == 's') {

					String mensagemRemocao = criadorDetarefas.removerTarefa(indiceDoArray, listaDeTarefas);
					System.out.println(mensagemRemocao);

				} else if (resp == 'N' || resp == 'n') {
					System.out.println("\nFim do programa\n");

				} else {
					System.out.println("\nOpção inválida!\n");
				}
				
				break;

			case 3:
				// Opção 3
				// Listar Tarefas;

				System.out.println(criadorDetarefas.listarTarefas(listaDeTarefas));

				break;
			case 4:
				// Opção 4
				// Listar em ordem alfabética;
				System.out.println(criadorDetarefas.listarTarefasEmOrdemAlfabetica(listaDeTarefas));
				System.out.println();
				break;
			case 5:
				// Opção 5
				// Listar em ordem cronológica
				System.out.println();
				break;
			case 6:
				System.out.println("\nFim do programa!");
				break;
			default:
				System.out.println("Opção inválida!\nTente de 1 a 6\n");

			}

			// Fim do switch
			/*------------------------------------------------------------------------*/

		}

		input.close();
		// Fim do while
		/*------------------------------------------------------------------------*/
	}
	
	public static void mock(ArrayList<Tarefa> listaDeTarefas) {
		
		listaDeTarefas.add(new Tarefa("Estudar Java", "Muito"));
		listaDeTarefas.add(new Tarefa("Estudar Cas", "Bastante"));
		listaDeTarefas.add(new Tarefa("Estudar teste", "teste"));
		listaDeTarefas.add(new Tarefa("Astra", "teste"));
	}

}
