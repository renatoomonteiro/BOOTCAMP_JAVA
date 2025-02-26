package br.com.cdb.bancodigital;
//POO - INTERFACE

/*
 * Uma interface nada mais é do que uma classe toda abstrata
 * Não é possível construir um objeto com ela
 * É possível implementar os métodos e defini-los
 * */
public interface ContaBancaria {
	
	public double getSaldo();
	
	public void depositar(double valor); 
	
	public boolean sacar(double valor);
	
	public void transferir(double valor, ContaBancaria destino);
		
}
