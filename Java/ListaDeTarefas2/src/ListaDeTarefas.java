/*
 * Classe intermediária, similar a DAO
 * Camada extra para o Gerenciador de Tarefas
 * 
 * */

import java.util.ArrayList;

public class ListaDeTarefas {
	// Lista de Classe Tarefa. O elemento dentro do < > deverá ser uma classe
	public ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
	
	
	//Todos os métodos públicos também ficarão aqui
	
	public void adicionarTarefa(String titulo, String descricao) {
		Tarefa tarefa = new Tarefa();
		tarefa.setTitulo(titulo);
		tarefa.setDescricao(descricao);
		
		listaDeTarefas.add(tarefa);
		
	}

	//Permite sobrescrita do método com o mesmo nome, mas com assinatura diferente
	public void adicionarTarefa(Tarefa tarefa){
		listaDeTarefas.add(tarefa);
	}

	public void removerTarefa(Tarefa t) {
		listaDeTarefas.remove(t);
		
	}
	
	public ArrayList<Tarefa> getListaTarefas(){
		return listaDeTarefas;
	}
	
	
}
