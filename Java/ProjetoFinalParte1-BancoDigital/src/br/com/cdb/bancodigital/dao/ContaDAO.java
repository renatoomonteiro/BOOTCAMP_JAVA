package br.com.cdb.bancodigital.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.entity.ContaBancariaEntity;

public class ContaDAO {
    private List<ContaBancariaEntity> contas = new ArrayList<>();

    public void adicionarConta(ContaBancariaEntity conta) {
        contas.add(conta);
    }

    public ContaBancariaEntity buscarContaPorNumero(int numeroConta) {
        for (ContaBancariaEntity conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<ContaBancariaEntity> listarTodas() {
        return contas;
    }
}