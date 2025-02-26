package br.com.cdb.heranca.model;

public class Professor extends Funcionario{
	
	public int numeroDeAulas;
	
	public Professor(String nome) {
		super(nome);
	}
	
	
	//Sobrecarga de métodos
	public void novoSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	public void novoSalario(double novoSalario, int nAulasAdicionais) {
		this.salario = novoSalario;
		this.numeroDeAulas += nAulasAdicionais;
		
	}
	
	//Sobrescrita do método da classe Pessoa
		@Override
		public void apresentacao() {
			System.out.println("Ola, eu sou o professor " + nome);
		}
}
