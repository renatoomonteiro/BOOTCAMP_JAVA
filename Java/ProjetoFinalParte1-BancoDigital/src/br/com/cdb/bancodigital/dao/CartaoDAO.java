package br.com.cdb.bancodigital.dao;

import java.util.ArrayList;

import br.com.cdb.bancodigital.entity.ContaBancariaEntity;

public class CartaoDAO {

    ArrayList<ContaBancariaEntity> listaDeContas = new ArrayList<>();

    public void addConta(ContaBancariaEntity conta) {
        listaDeContas.add(conta);
    }

    public ContaBancariaEntity buscarClientePorCPF(int idCliente) {
        for (ContaBancariaEntity c : listaDeContas) {
            if (c.getIdCliente() == idCliente) {
                return c;
            }
        }
        return null;
    }

    public ContaBancariaEntity buscarContaPorNumero(int numConta) {
        for (ContaBancariaEntity c : listaDeContas) {
            if (c.getNumeroConta() == numConta) {
                return c;
            }
        }
        return null;
    }
}