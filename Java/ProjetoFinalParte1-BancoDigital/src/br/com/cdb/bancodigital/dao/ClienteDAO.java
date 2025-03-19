package br.com.cdb.bancodigital.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.entity.CadastroDeClientes;

public class ClienteDAO {
    private List<CadastroDeClientes> clientes = new ArrayList<>();

    public void adicionarCliente(CadastroDeClientes cliente) {
        clientes.add(cliente);
    }

    public CadastroDeClientes buscarClientePorCPF(String cpf) {
        for (CadastroDeClientes cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public List<CadastroDeClientes> listarTodos() {
        return clientes;
    }
}