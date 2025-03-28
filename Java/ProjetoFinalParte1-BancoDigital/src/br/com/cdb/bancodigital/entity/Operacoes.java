package br.com.cdb.bancodigital.entity;

public class Operacoes {
    private String transferencia;
    private String deposito;
    private String saque;
    private String estorno;
    private String extrato;
    private String saldo;
    private String pagamento;
    private int idOperacao;
    private int senhaNumerica;

    // Construtores, getters e setters
    public Operacoes() {
    }

    public Operacoes(String transferencia, String deposito, String saque, String estorno, String extrato, String saldo, String pagamento, int idOperacao, int senhaNumerica) {
        this.transferencia = transferencia;
        this.deposito = deposito;
        this.saque = saque;
        this.estorno = estorno;
        this.extrato = extrato;
        this.saldo = saldo;
        this.pagamento = pagamento;
        this.idOperacao = idOperacao;
        this.senhaNumerica = senhaNumerica;
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    public String getEstorno() {
        return estorno;
    }

    public void setEstorno(String estorno) {
        this.estorno = estorno;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(int idOperacao) {
        this.idOperacao = idOperacao;
    }

    public int getSenhaNumerica() {
        return senhaNumerica;
    }

    public void setSenhaNumerica(int senhaNumerica) {
        this.senhaNumerica = senhaNumerica;
    }
}