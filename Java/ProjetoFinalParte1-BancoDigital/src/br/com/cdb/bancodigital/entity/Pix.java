package br.com.cdb.bancodigital.entity;

public class Pix extends Operacoes {
    private String tipoDeChave;
    private String numChaveAleatoria;
    private int numeroDaChave;

    // Construtores, getters e setters
    public Pix() {
    }

    public Pix(String tipoDeChave, String numChaveAleatoria, int numeroDaChave) {
        this.tipoDeChave = tipoDeChave;
        this.numChaveAleatoria = numChaveAleatoria;
        this.numeroDaChave = numeroDaChave;
    }

    public String getTipoDeChave() {
        return tipoDeChave;
    }

    public void setTipoDeChave(String tipoDeChave) {
        this.tipoDeChave = tipoDeChave;
    }

    public String getNumChaveAleatoria() {
        return numChaveAleatoria;
    }

    public void setNumChaveAleatoria(String numChaveAleatoria) {
        this.numChaveAleatoria = numChaveAleatoria;
    }

    public int getNumeroDaChave() {
        return numeroDaChave;
    }

    public void setNumeroDaChave(int numeroDaChave) {
        this.numeroDaChave = numeroDaChave;
    }
}