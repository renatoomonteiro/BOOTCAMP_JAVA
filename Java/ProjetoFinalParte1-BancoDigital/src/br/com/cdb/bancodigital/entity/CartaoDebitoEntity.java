package br.com.cdb.bancodigital.entity;

public class CartaoDebitoEntity extends CartoesEntity {
    private String dadosClienteCartaoDebito;
    private int numCartaoDebito;
    private int senhaCartaoDebido;
    private double limiteDiarioDeTransacao;

    // Construtores, getters e setters
    public CartaoDebitoEntity() {
    }

    public CartaoDebitoEntity(String dadosClienteCartaoDebito, int numCartaoDebito, int senhaCartaoDebido, double limiteDiarioDeTransacao) {
        this.dadosClienteCartaoDebito = dadosClienteCartaoDebito;
        this.numCartaoDebito = numCartaoDebito;
        this.senhaCartaoDebido = senhaCartaoDebido;
        this.limiteDiarioDeTransacao = limiteDiarioDeTransacao;
    }

    public String getDadosClienteCartaoDebito() {
        return dadosClienteCartaoDebito;
    }

    public void setDadosClienteCartaoDebito(String dadosClienteCartaoDebito) {
        this.dadosClienteCartaoDebito = dadosClienteCartaoDebito;
    }

    public int getNumCartaoDebito() {
        return numCartaoDebito;
    }

    public void setNumCartaoDebito(int numCartaoDebito) {
        this.numCartaoDebito = numCartaoDebito;
    }

    public int getSenhaCartaoDebido() {
        return senhaCartaoDebido;
    }

    public void setSenhaCartaoDebido(int senhaCartaoDebido) {
        this.senhaCartaoDebido = senhaCartaoDebido;
    }

    public double getLimiteDiarioDeTransacao() {
        return limiteDiarioDeTransacao;
    }

    public void setLimiteDiarioDeTransacao(double limiteDiarioDeTransacao) {
        this.limiteDiarioDeTransacao = limiteDiarioDeTransacao;
    }
}