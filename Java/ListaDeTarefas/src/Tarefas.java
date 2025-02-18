import java.util.ArrayList;
import java.util.Collections;

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
	
	private ArrayList<String> listaTarefas = new ArrayList<>();
	
	
	public Tarefas(String nomeTarefa, int opcaoTarefa, ArrayList<String> listaTarefas) {
		super();
		this.nomeTarefa = nomeTarefa;
		this.opcaoTarefa = opcaoTarefa;
		this.listaTarefas = listaTarefas;
	}

	public void addTarefa(String nomeTarefa) {
		listaTarefas.add(nomeTarefa);				
	}
	
	public ArrayList<String> getListaTarefas() {
		return listaTarefas;
	}
 
	public void setListaTarefas(ArrayList<String> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
		
	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
	public int getOpcaoTarefa() {
		return opcaoTarefa;
	}

	public void setOpcaoTarefa(int opcaoTarefa) {
		this.opcaoTarefa = opcaoTarefa;
	}


	//Método privado para inserir tarefas
	private void adicionarTarefa(String nomeTarefa) {
		listaTarefas.add(nomeTarefa);
	}
	
	//Método privado para remover tarefas
	private void removerTarefa(String nomeTarefa) {
			listaTarefas.remove(nomeTarefa);
	}
	
	//Método privado para listar tarefas
	private ArrayList listarTarefas(ArrayList listaTarefas) {
		
		return listaTarefas;
	}
	
	private void alfabetica(ArrayList listaTarefas) {
		//Exibir as tarefas em ordem alfabética:
		Collections.sort(listaTarefas);
	}
	
	private void cronologica(ArrayList listaTarefas) { //Precisarei pesquisar mais para desenvolver este método
		 //Exibe a tarefas em ordem cronológica
	}
	
	public void crudTarefa(String nomeTarefa, int opcaoTarefa) {

		switch (opcaoTarefa) {

		case 1: {
			adicionarTarefa(nomeTarefa);
			break;
		}
		case 2: {
			removerTarefa(nomeTarefa);
			break;
		}
		
	}
		//return resultadoTarefa;
}

	//Não conesegui deixar estes dois métodos dentro do Switch do método crudTarefa, pois ele recebe um nome de tarefas
	//Nestes dos casos, precisei tratar o ArrayList inteiro, então chamei métodos privados dentro deles
	public ArrayList listarTarefas1(ArrayList listaTarefas) {
		return listarTarefas(listaTarefas);
	}

	public void listarAlfabetica(ArrayList listaTarefas) {
		 alfabetica(listaTarefas);
	}
	//Teste commit em 18/02/2025	

}
