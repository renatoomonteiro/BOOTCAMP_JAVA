package br.com.cdb.bancodigital.entity;

public class ContaCorrenteEntity extends ContaBancariaEntity {
    private int limites;
    private double manutencaoMensal;

    // Construtores, getters e setters
    public ContaCorrenteEntity() {
    }

    public ContaCorrenteEntity(String tipoConta, int numAgencia, int numeroConta, int idCliente, double saldoDaConta, int limites, double manutencaoMensal) {
        super(tipoConta, numAgencia, numeroConta, idCliente, saldoDaConta);
        this.limites = limites;
        this.manutencaoMensal = manutencaoMensal;
    }

    public int getLimites() {
        return limites;
    }

    public void setLimites(int limites) {
        this.limites = limites;
    }

    public double getManutencaoMensal() {
        return manutencaoMensal;
    }

    public void setManutencaoMensal(double manutencaoMensal) {
        this.manutencaoMensal = manutencaoMensal;
    }

    public void aplicarTaxaManutencao() {
        setSaldoDaConta(getSaldoDaConta() - manutencaoMensal);
    }
}