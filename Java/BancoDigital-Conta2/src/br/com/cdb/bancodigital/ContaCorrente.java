package br.com.cdb.bancodigital;
//A conta conrrente irá implementar a classe conta bancária:
public class ContaCorrente implements ContaBancaria{

	
	private double saldo;
	//Quando criar o objeto e atrubuir valr ao numero, ele não mudará mais, 
	//devido a palavra especial final.
	//private final long numero;
	private long numero;
	
//	public ContaCorrente(long numero) {
//		this.numero = numero;
//	}
	
	@Override
	public double getSaldo() {

		return saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo < valor) {
			return false;
		}else {
			saldo-= valor;
			return true;
		}
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) {
		
		if(sacar(valor) == true) {
			destino.depositar(valor);
		}
		
		
	}

	
	
}
