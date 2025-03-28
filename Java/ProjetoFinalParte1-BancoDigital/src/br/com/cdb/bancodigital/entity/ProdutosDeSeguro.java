package br.com.cdb.bancodigital.entity;

public class ProdutosDeSeguro {
    private String tiposDeProdutos;
    private String apoliceEletrônica;
    private String dtContratacao;
    private String dadosCartao;
    private String condicoesAcionamento;
    private String detalhesDaCobertura;
    private int numDaApolice;
    private double valorApolice;

    // Construtores, getters e setters
    public ProdutosDeSeguro() {
    }

    public ProdutosDeSeguro(String tiposDeProdutos, String apoliceEletrônica, String dtContratacao, String dadosCartao, String condicoesAcionamento, String detalhesDaCobertura, int numDaApolice, double valorApolice) {
        this.tiposDeProdutos = tiposDeProdutos;
        this.apoliceEletrônica = apoliceEletrônica;
        this.dtContratacao = dtContratacao;
        this.dadosCartao = dadosCartao;
        this.condicoesAcionamento = condicoesAcionamento;
        this.detalhesDaCobertura = detalhesDaCobertura;
        this.numDaApolice = numDaApolice;
        this.valorApolice = valorApolice;
    }

    public String getTiposDeProdutos() {
        return tiposDeProdutos;
    }

    public void setTiposDeProdutos(String tiposDeProdutos) {
        this.tiposDeProdutos = tiposDeProdutos;
    }

    public String getApoliceEletrônica() {
        return apoliceEletrônica;
    }

    public void setApoliceEletrônica(String apoliceEletrônica) {
        this.apoliceEletrônica = apoliceEletrônica;
    }

    public String getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(String dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public String getDadosCartao() {
        return dadosCartao;
    }

    public void setDadosCartao(String dadosCartao) {
        this.dadosCartao = dadosCartao;
    }

    public String getCondicoesAcionamento() {
        return condicoesAcionamento;
    }

    public void setCondicoesAcionamento(String condicoesAcionamento) {
        this.condicoesAcionamento = condicoesAcionamento;
    }

    public String getDetalhesDaCobertura() {
        return detalhesDaCobertura;
    }

    public void setDetalhesDaCobertura(String detalhesDaCobertura) {
        this.detalhesDaCobertura = detalhesDaCobertura;
    }

    public int getNumDaApolice() {
        return numDaApolice;
    }

    public void setNumDaApolice(int numDaApolice) {
        this.numDaApolice = numDaApolice;
    }

    public double getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
    }
}