import java.util.ArrayList;
import java.util.List;

public class Tarefas {
	/*
	 * Enunciado Crie uma Lista de Tarefas Crie uma aplicação que tenha pelo menos
	 * uma classe Principal e uma classe Tarefa. As tarefas devem ser armazenadas em
	 * um ArrayList. Você deve seguir os seguintes requisitos: As propriedades devem
	 * estar encapsuladas; Na Aplicação Main, ter um menu com pelo menos as
	 * seguintes opções: Adicionar Terefas (verificar se a tarefa já existe antes de
	 * adicioná-la); Remover Tarefa (Pedir confirmação para efetuar a remoção);
	 * Listar Tarefas; Listar em ordem alfabética; Listar em ordem cronológica Na
	 * aplicação Main terá um ArrayList de Tarefa? ou uma Classe ListaDeTarefas com
	 * um ArrayList?
	 */
	ArrayList<Object> listaDeTarefas = new ArrayList<Object>();

	
	
	private String nomeDaTarefa, descricaoDaTarefa;

	public Tarefas(String nomeDaTarefa, String descricaoDaTarefa) {
		this.nomeDaTarefa = nomeDaTarefa;
		this.descricaoDaTarefa = descricaoDaTarefa;
	}

	public ArrayList<Object> getListaDeTarefas() {
		return listaDeTarefas;
	}
	
	
	
	
	public void setListaDeTarefas(ArrayList<Object> listaDeTarefas) {
		this.listaDeTarefas = listaDeTarefas;
	}

	public String getNomeDaTarefa() {
		return nomeDaTarefa;
	}

	public void setNomeDaTarefa(String nomeDaTarefa) {
		this.nomeDaTarefa = nomeDaTarefa;
		
	}

	public String getDescricaoDaTarefa() {
		return descricaoDaTarefa;
	}

	public void setDescricaoDaTarefa(String descricaoDaTarefa) {
		this.descricaoDaTarefa = descricaoDaTarefa;
	}

}
