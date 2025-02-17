import java.util.ArrayList;

public class Tarefas {

	/* Enunciado
	 * Crie uma Lista de Tarefas
	 * Crie uma aplicação que tenha pelo menos uma classe Principal e uma classe Tarefa. 
	 * As tarefas devem ser armazenadas em um ArrayList. 
	 * Você deve seguir os seguintes requisitos:
	 * As propriedades devem estar encapsuladas;
	 * Na Aplicação Main, ter um menu com pelo menos as seguintes opções: Adicionar Terefas 
	 * (verificar se a tarefa já existe antes de adicioná-la); 
	 * Remover Tarefa (Pedir confirmação para efetuar a remoção);
	 * Listar Tarefas; Listar em ordem alfabética; Listar em ordem cronológica
	 * Na aplicação Main terá um ArrayList de Tarefa?
	 * ou uma Classe ListaDeTarefas com um ArrayList?
	 */
	
	private String nomeTarefa;
	private int opcaoTarefa;
	
	//Método construtor da Classe Tarefas//
	public Tarefas(String nomeTarefa, int opcaoTarefa) {
		this.nomeTarefa = nomeTarefa;
		this.opcaoTarefa = opcaoTarefa;
	}

	
	//Getters and Setters dos campos
	
	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
	//Método privado para inserir tarefas
	private ArrayList adicionarTarefa(ArrayList listaTarefas, String nomeTarefa) {
		//Verifica se a tarefa não existe na lista
		if(!listaTarefas.contains(nomeTarefa)) {
			//Se verdadeiro, insere
			listaTarefas.add(nomeTarefa);
			} else {
			//Senão verifica qual é igual
			listaTarefas.equals(nomeTarefa);
		}
		return listaTarefas;
	}
	
	private void removerTarefa(ArrayList listaTarefas, String nomeTarefa) {
		//Verifica se existe
		if(listaTarefas.contains(nomeTarefa)) {
			//Se positivo, remover com base em seu índice
			listaTarefas.remove(listaTarefas.indexOf(nomeTarefa));
		} else {
			//Senão diz que não existe
			listaTarefas.isEmpty();
		}
	}
	
	private void listarTarefas(ArrayList listaTarefas) {
		//Exibe todos os elementos da lista
		listaTarefas.toArray();
	}
	
	
	private void alfabetica(ArrayList listaTarefas) {
		//Exibir as tarefas em ordem alfabética:
		listaTarefas.sort(null);
	}
	
	private void cronologica(ArrayList listaTarefas) {
		 //Exibe a tarefas em ordem cronológica
	}
	
	/*
	 * Criar o método público que acionará os métodos privados para 
	 * adicionar; 
	 * remover;
	 * listar;
	 * exibir em ordem alfabética;
	 * exibir em ordem cronológica.
	 * */
	
	public String crudTarefa(String nomeTarefa, int opcaoTarefa) {
		
		String resultadoTarefa = "";
		
		switch (opcaoTarefa) {
		case 1: {
			
		}

		}

		return resultadoTarefa;
	}

}
