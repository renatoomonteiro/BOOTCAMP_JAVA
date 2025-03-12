//Teste commit 10/03/2025 
package br.com.cdb.bancodigital.entity;

public class CartaoCreditoEntity extends CartoesEntity{
	private String dadosClienteCartaoCredito;
	private int numcartaoCredito, senhaCartaoCredito;
	private double limitePreAprovado;
	private boolean bloqNovosPagamentos = false;
}
