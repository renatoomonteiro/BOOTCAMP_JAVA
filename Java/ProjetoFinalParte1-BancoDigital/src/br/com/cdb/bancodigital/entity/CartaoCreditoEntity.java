package br.com.cdb.bancodigital.entity;

public class CartaoCreditoEntity extends CartoesEntity {
    private String dadosClienteCartaoCredito;
    private int numcartaoCredito;
    private int senhaCartaoCredito;
    private double limitePreAprovado;
    private boolean bloqNovosPagamentos = false;

    // Construtores, getters e setters
    public CartaoCreditoEntity() {
    }

    public CartaoCreditoEntity(String dadosClienteCartaoCredito, int numcartaoCredito, int senhaCartaoCredito, double limitePreAprovado) {
        this.dadosClienteCartaoCredito = dadosClienteCartaoCredito;
        this.numcartaoCredito = numcartaoCredito;
        this.senhaCartaoCredito = senhaCartaoCredito;
        this.limitePreAprovado = limitePreAprovado;
    }

    public String getDadosClienteCartaoCredito() {
        return dadosClienteCartaoCredito;
    }

    public void setDadosClienteCartaoCredito(String dadosClienteCartaoCredito) {
        this.dadosClienteCartaoCredito = dadosClienteCartaoCredito;
    }

    public int getNumcartaoCredito() {
        return numcartaoCredito;
    }

    public void setNumcartaoCredito(int numcartaoCredito) {
        this.numcartaoCredito = numcartaoCredito;
    }

    public int getSenhaCartaoCredito() {
        return senhaCartaoCredito;
    }

    public void setSenhaCartaoCredito(int senhaCartaoCredito) {
        this.senhaCartaoCredito = senhaCartaoCredito;
    }

    public double getLimitePreAprovado() {
        return limitePreAprovado;
    }

    public void setLimitePreAprovado(double limitePreAprovado) {
        this.limitePreAprovado = limitePreAprovado;
    }

    public boolean isBloqNovosPagamentos() {
        return bloqNovosPagamentos;
    }

    public void setBloqNovosPagamentos(boolean bloqNovosPagamentos) {
        this.bloqNovosPagamentos = bloqNovosPagamentos;
    }
}