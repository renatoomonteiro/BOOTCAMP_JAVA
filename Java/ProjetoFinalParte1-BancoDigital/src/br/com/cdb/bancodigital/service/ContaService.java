package br.com.cdb.bancodigital.service;

import java.util.List;

import br.com.cdb.bancodigital.dao.ContaDAO;
import br.com.cdb.bancodigital.entity.ContaBancariaEntity;
import br.com.cdb.bancodigital.entity.ContaCorrenteEntity;
import br.com.cdb.bancodigital.entity.ContaPoupancaEntity;

public class ContaService {
    private ContaDAO contaDAO = new ContaDAO();

    public void aplicarTaxasEManterContas() {
        List<ContaBancariaEntity> contas = contaDAO.listarTodas();

        for (ContaBancariaEntity conta : contas) {
            if (conta instanceof ContaCorrenteEntity) {
                ((ContaCorrenteEntity) conta).aplicarTaxaManutencao();
            } else if (conta instanceof ContaPoupancaEntity) {
                ((ContaPoupancaEntity) conta).aplicarRendimentoMensal();
            }
        }
    }

    public void adicionarConta(ContaBancariaEntity conta) {
        contaDAO.adicionarConta(conta);
    }

    public ContaBancariaEntity buscarContaPorNumero(int numeroConta) {
        return contaDAO.buscarContaPorNumero(numeroConta);
    }

    public List<ContaBancariaEntity> listarTodas() {
        return contaDAO.listarTodas();
    }

    public void depositar(int numeroConta, double valor) {
        ContaBancariaEntity conta = buscarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.setSaldoDaConta(conta.getSaldoDaConta() + valor);
        }
    }

    public boolean sacar(int numeroConta, double valor) {
        ContaBancariaEntity conta = buscarContaPorNumero(numeroConta);
        if (conta != null && conta.getSaldoDaConta() >= valor) {
            conta.setSaldoDaConta(conta.getSaldoDaConta() - valor);
            return true;
        }
        return false;
    }

    public boolean transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        ContaBancariaEntity contaOrigem = buscarContaPorNumero(numeroContaOrigem);
        ContaBancariaEntity contaDestino = buscarContaPorNumero(numeroContaDestino);
        if (contaOrigem != null && contaDestino != null && contaOrigem.getSaldoDaConta() >= valor) {
            contaOrigem.setSaldoDaConta(contaOrigem.getSaldoDaConta() - valor);
            contaDestino.setSaldoDaConta(contaDestino.getSaldoDaConta() + valor);
            return true;
        }
        return false;
    }
}