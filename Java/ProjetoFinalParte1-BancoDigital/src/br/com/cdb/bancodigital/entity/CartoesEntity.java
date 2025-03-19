package br.com.cdb.bancodigital.entity;

public class CartoesEntity {
    private String tipoCartao;
    private String status; // ativo/desativo
    private boolean ativacao = true;
    private boolean alteracaoDeSenha = false;

    // Construtores, getters e setters
    public CartoesEntity() {
    }

    public CartoesEntity(String tipoCartao, String status, boolean ativacao, boolean alteracaoDeSenha) {
        this.tipoCartao = tipoCartao;
        this.status = status;
        this.ativacao = ativacao;
        this.alteracaoDeSenha = alteracaoDeSenha;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAtivacao() {
        return ativacao;
    }

    public void setAtivacao(boolean ativacao) {
        this.ativacao = ativacao;
    }

    public boolean isAlteracaoDeSenha() {
        return alteracaoDeSenha;
    }

    public void setAlteracaoDeSenha(boolean alteracaoDeSenha) {
        this.alteracaoDeSenha = alteracaoDeSenha;
    }
}