package br.com.cdb.bancodigital.view;

import java.util.Scanner;

import br.com.cdb.bancodigital.entity.CadastroDeClientes;
import br.com.cdb.bancodigital.entity.ContaCorrenteEntity;
import br.com.cdb.bancodigital.entity.ContaPoupancaEntity;
import br.com.cdb.bancodigital.entity.CategoriasDeClientes;
import br.com.cdb.bancodigital.entity.ContaBancariaEntity;
import br.com.cdb.bancodigital.service.ContaService;
import br.com.cdb.bancodigital.service.ClienteService;

public class Menu {

    ClienteService clienteService = new ClienteService();
    ContaService contaService = new ContaService();
    Scanner input = new Scanner(System.in);

    public Menu() {
        System.out.println("\nBem vindo ao Banco Digital DCB!\n");
        menuPrincipal();
    }

    public void menuPrincipal() {
        boolean menu = true;
        while (menu) {
            System.out.println("\n1 - Cadastrar novo Cliente\n" +
                               "2 - Entrar com CPF do Cliente\n" +
                               "3 - Sair");

            int escolha = input.nextInt();
            input.nextLine(); // Consume newline
            switch (escolha) {
                case 1:
                    cadastrarNovoCliente();
                    break;
                case 2:
                    entrarComCpfDoCliente();
                    break;
                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void cadastrarNovoCliente() {
        System.out.println("\nInsira o seu nome: ");
        String nome = input.nextLine();
        System.out.println("\nInsira o seu CPF: ");
        String cpf = input.nextLine();
        System.out.println("\nInsira a sua data de nascimento (DD/MM/AAAA): ");
        String dtNascimento = input.nextLine();
        System.out.println("\nInsira o seu endereço: ");
        String endereco = input.nextLine();
        System.out.println("\nSelecione a categoria do cliente:\n1 - Comum\n2 - Super\n3 - Premium");
        int categoriaEscolha = input.nextInt();
        input.nextLine(); // Consume newline

        CategoriasDeClientes categoria = null;
        double manutencaoMensal = 0;
        double rendimentoAnual = 0;

        switch (categoriaEscolha) {
            case 1:
                categoria = CategoriasDeClientes.COMUM;
                manutencaoMensal = 12.0;
                rendimentoAnual = 0.005;
                break;
            case 2:
                categoria = CategoriasDeClientes.SUPER;
                manutencaoMensal = 8.0;
                rendimentoAnual = 0.007;
                break;
            case 3:
                categoria = CategoriasDeClientes.PREMIUM;
                manutencaoMensal = 0.0;
                rendimentoAnual = 0.009;
                break;
            default:
                System.out.println("Categoria inválida.");
                return;
        }

        CadastroDeClientes cliente = new CadastroDeClientes(nome, cpf, dtNascimento, endereco);
        cliente.setCategoria(categoria);

        if (clienteService.addCliente(cliente)) {
            System.out.println("\nCliente cadastrado com sucesso!");
            cadastrarConta(cliente, manutencaoMensal, rendimentoAnual);
        } else {
            System.err.println("\nFalha no cadastro. Verifique os dados e tente novamente.");
        }
    }

    private void cadastrarConta(CadastroDeClientes cliente, double manutencaoMensal, double rendimentoAnual) {
        System.out.println("\nEscolha o tipo de conta:\n1 - Corrente\n2 - Poupança");
        int tipoConta = input.nextInt();
        input.nextLine(); // Consume newline
        
        System.out.println("\nInsira o saldo inicial: ");
        double saldoInicial = input.nextDouble();
        input.nextLine(); // Consume newline

        if (tipoConta == 1) {
            ContaCorrenteEntity contaCorrente = new ContaCorrenteEntity("Corrente", 123, cliente.getCpf().hashCode(), cliente.getCpf().hashCode(), saldoInicial, 500, manutencaoMensal);
            contaService.adicionarConta(contaCorrente);
            System.out.println("Conta Corrente criada com sucesso!");
        } else if (tipoConta == 2) {
            ContaPoupancaEntity contaPoupanca = new ContaPoupancaEntity("Poupança", 123, cliente.getCpf().hashCode(), cliente.getCpf().hashCode(), saldoInicial, rendimentoAnual);
            contaService.adicionarConta(contaPoupanca);
            System.out.println("Conta Poupança criada com sucesso!");
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }

    private void entrarComCpfDoCliente() {
        System.out.println("\nInsira o CPF do Cliente: ");
        String cpf = input.nextLine();
        CadastroDeClientes cliente = clienteService.buscarClientePorCPF(cpf);
        if (cliente != null) {
            menuConta(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void menuConta(CadastroDeClientes cliente) {
        boolean menu = true;
        while (menu) {
            System.out.println("\n1 - Ver Saldo\n" +
                               "2 - Depósito\n" +
                               "3 - Saque\n" +
                               "4 - Transferência\n" +
                               "5 - Sair");

            int escolha = input.nextInt();
            input.nextLine(); // Consume newline
            switch (escolha) {
                case 1:
                    verSaldo(cliente);
                    break;
                case 2:
                    realizarDeposito(cliente);
                    break;
                case 3:
                    realizarSaque(cliente);
                    break;
                case 4:
                    realizarTransferencia(cliente);
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void verSaldo(CadastroDeClientes cliente) {
        ContaBancariaEntity conta = contaService.buscarContaPorNumero(cliente.getCpf().hashCode());
        if (conta != null) {
            System.out.println("Saldo atual: " + conta.getSaldoDaConta());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void realizarDeposito(CadastroDeClientes cliente) {
        System.out.println("\nInsira o valor do depósito: ");
        double valor = input.nextDouble();
        input.nextLine(); // Consume newline
        contaService.depositar(cliente.getCpf().hashCode(), valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    private void realizarSaque(CadastroDeClientes cliente) {
        System.out.println("\nInsira o valor do saque: ");
        double valor = input.nextDouble();
        input.nextLine(); // Consume newline
        if (contaService.sacar(cliente.getCpf().hashCode(), valor)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private void realizarTransferencia(CadastroDeClientes cliente) {
        System.out.println("\nInsira o CPF do destinatário: ");
        String cpfDestinatario = input.nextLine();
        System.out.println("\nInsira o valor da transferência: ");
        double valor = input.nextDouble();
        input.nextLine(); // Consume newline
        if (contaService.transferir(cliente.getCpf().hashCode(), cpfDestinatario.hashCode(), valor)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou conta destinatária não encontrada.");
        }
    }
}