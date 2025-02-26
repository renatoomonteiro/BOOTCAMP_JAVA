package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa{

	public double salario;
	
	public Funcionario (String nome) {
		
		super(nome);
		
	}
	
	//Sobrescrita do método da classe Pessoa
		@Override
		public void apresentacao() {
			System.out.println("Ola, eu sou o funcionário " + nome );
			
		}
}
