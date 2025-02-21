import java.util.ArrayList;

public class OperacoesComTarefa {

	public String adicionarTarefa(String nome, String descricao, ArrayList<Tarefa> lista) {

		for (Tarefa item : lista) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				return "Já há uma tarefa com esse nome!";
			}
		}

		Tarefa tarefa = new Tarefa(nome, descricao);

		lista.add(tarefa);

		return "Tarefa adicionada com sucesso!";

	}

	public String removerTarefa(int indiceDaLista, ArrayList<Tarefa> lista) {
		if (lista.size() > indiceDaLista - 1) {
			lista.remove(indiceDaLista - 1);
			return "Removido com sucesso!";
		} else {
			return "Tarefa não localizada!";
		}
	}

	public String listarTarefas(ArrayList<Tarefa> lista) {

		String retorno = "";

		if (lista.isEmpty()) {
			return "Não há itens a serem exibidos!";
		} else {
			for (int i = 0; i < lista.size(); i++) {
				retorno = retorno + (i + 1) + " ) Nome: " + lista.get(i).getNome() + " Descrição: "
						+ lista.get(i).getDescricao() +"\n";
			}
		}
		return retorno;
	}
	
	public String listarTarefasEmOrdemAlfabetica(ArrayList<Tarefa> lista) {

		String retorno = "";

		if (lista.isEmpty()) {
			return "Não há itens a serem exibidos!";
		} else {
			
			ordenaPorNome(lista);
			
			for (int i = 0; i < lista.size(); i++) {
				retorno = retorno + (i + 1) + " ) Nome: " + lista.get(i).getNome() + " Descrição: "
						+ lista.get(i).getDescricao() +"\n";
			}
		}
		return retorno;
	}
	
	private void ordenaPorNome(ArrayList<Tarefa> lista) {
		
		for(int externo = 0; externo< lista.size(); externo++) {
			
			for(int interno = externo+1; interno < lista.size() ; interno++) {
				String nomeExterno = lista.get(externo).getNome();
				String nomeInterno = lista.get(interno).getNome();
				var hat = lista.get(externo).getNome().compareTo(lista.get(interno).getNome());
				
				if(lista.get(externo).getNome().compareTo(lista.get(interno).getNome()) > 0) {
					
					lista.add(externo,  lista.get(interno));
					lista.remove(interno+1);
					externo = externo == 0 ? 0 : externo--;
				}
			}
		}
	}
	
}
