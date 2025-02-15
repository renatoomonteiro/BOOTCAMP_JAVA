package br.com.cdb.bancodigital;

public class Main {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta(123456);
		contaCorrente.depositar(1000);
		
		Conta contaPoupaca = new Conta(654321);
		contaPoupaca.depositar(500);
		//Teste commit
		System.out.println("Conta nº" + contaCorrente.getNumero() + " possui o saldo R$ " + contaPoupaca.getSaldo());

	}

}
