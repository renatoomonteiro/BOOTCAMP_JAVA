package br.com.cdb.heranca.model;

//Não é possível instanciar uma classe abstrara, apenas servirá de modelo
public abstract class Pessoa {

	//Essa classe servirá como uma Model
	//Propriedades
	public String nome;
	public long cpf;
	
	//Métodos:
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//Método de sobre-escrita para não retornar a posição da memória 
	@Override
	public String toString() {
		return this.nome + " - " + this.cpf;
	}
	
	//As classes filhas, que precisarem se apresentar, terão que utilizar o método 
	//abstrato apresentacao()
	public abstract void apresentacao();
}
