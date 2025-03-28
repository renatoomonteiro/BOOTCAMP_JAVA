package br.com.cdb.bancodigital.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CadastroDeClientes {
    private String nome;
    private String cpf;
    private String dtNascimento;
    private String endereco;
    private CategoriasDeClientes categoria;

    // Construtores, getters e setters
    public CadastroDeClientes() {
    }

    public CadastroDeClientes(String nome, String cpf, String dtNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CategoriasDeClientes getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriasDeClientes categoria) {
        this.categoria = categoria;
    }

    public boolean validarDataNascimento() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(this.dtNascimento, formatter);
            LocalDate hoje = LocalDate.now();
            return !dataNascimento.isAfter(hoje.minusYears(18));
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public boolean validarEndereco() {
        return this.endereco != null && this.endereco.matches("^.*\\d+.*$") && this.endereco.length() <= 255;
    }
}