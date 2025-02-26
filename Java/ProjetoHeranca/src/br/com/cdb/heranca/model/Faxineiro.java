package br.com.cdb.heranca.model;

public class Faxineiro extends Funcionario{
	
	public String turno;
	
	public Faxineiro(String nome) {
		super(nome);
		
	}
	
	//Sobrescrita do método da classe Pessoa
		@Override
		public void apresentacao() {
			System.out.println("Ola, eu sou o faxineiro " + nome);
		}
}
