package br.com.cdb.heranca.model;

public class Aluno extends Pessoa{
	
	public int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		
		super(nome);
		this.numeroMatricula = numeroMatricula;
		
	}
	
	//Sobrescrita do método da classe Pessoa
	@Override
	public void apresentacao() {
		System.out.println("Ola, eu sou o aluno " + nome + 
				" e a minha matricula é " + numeroMatricula);
	}	
	
	
}
