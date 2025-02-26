//Final

package br.com.cdb.bancodigital;

public class Main {

	public static void main(String[] args) {
		
//		Conta contaCorrente = new Conta(123456);
//		contaCorrente.depositar(1000);
//		
//		Conta contaPoupaca = new Conta(654321);
//		contaPoupaca.depositar(500);
//		//Teste commit
//		System.out.println("Conta nº" + contaCorrente.getNumero() + " possui o saldo R$ " + contaPoupaca.getSaldo());
		
		ContaBancaria cc = new ContaCorrente();
		cc.depositar(1000.0);
		ContaBancaria cc2 = new ContaCorrente();
		cc2.depositar(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca();
		cc.depositar(500.0);

		
		cc.depositar(500.0);
		cp.sacar(200.0);
		cc.transferir(300, cp);
		
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println("Saldo da conta poupança: " + cp.getSaldo());
		
	}

}
