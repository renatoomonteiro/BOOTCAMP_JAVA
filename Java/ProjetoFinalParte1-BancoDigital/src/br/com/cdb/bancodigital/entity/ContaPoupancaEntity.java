package br.com.cdb.bancodigital.entity;

public class ContaPoupancaEntity extends ContaBancariaEntity {
    private double rendimentoAnual;

    // Construtores, getters e setters
    public ContaPoupancaEntity() {
    }

    public ContaPoupancaEntity(String tipoConta, int numAgencia, int numeroConta, int idCliente, double saldoDaConta, double rendimentoAnual) {
        super(tipoConta, numAgencia, numeroConta, idCliente, saldoDaConta);
        this.rendimentoAnual = rendimentoAnual;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public void aplicarRendimentoMensal() {
        double rendimentoMensal = Math.pow(1 + rendimentoAnual, 1.0 / 12) - 1;
        setSaldoDaConta(getSaldoDaConta() * (1 + rendimentoMensal));
    }
}