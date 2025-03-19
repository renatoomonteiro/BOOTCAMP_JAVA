package br.com.cdb.bancodigital.entity;

public class ContaBancariaEntity {
    private String tipoConta; // Corrente || Poupança
    private int numAgencia;
    private int numeroConta;
    private int idCliente;
    private double saldoDaConta;

    // Construtores, getters e setters
    public ContaBancariaEntity() {
    }

    public ContaBancariaEntity(String tipoConta, int numAgencia, int numeroConta, int idCliente, double saldoDaConta) {
        this.tipoConta = tipoConta;
        this.numAgencia = numAgencia;
        this.numeroConta = numeroConta;
        this.idCliente = idCliente;
        this.saldoDaConta = saldoDaConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }
}