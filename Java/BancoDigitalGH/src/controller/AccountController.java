package controller;

import service.AccountService;
import entity.Account;

public class AccountController {
    private AccountService accountService = new AccountService();

    public void createAccount(int id, String owner, double balance) {
        accountService.createAccount(id, owner, balance);
        System.out.println("\nDados da conta criada: " + accountService.getAccount(id));
    }

    public void viewAccount(int id) {
        Account account = accountService.getAccount(id);
        if (account != null) {
            System.out.println("\nDetalhes da conta: " + account);
        } else {
            System.out.println("\nConta não encontrada");
        }
    }

    public void deposit(int id, double amount) {
        accountService.deposit(id, amount);
        System.out.println("Deposito de R$ " + amount + " realizado na conta nº" + id);
    }

    public void withdraw(int id, double amount) {
        accountService.withdraw(id, amount);
        System.out.println("Saque de R$" + amount + " realizado na conta nº " + id);
    }

    public void deleteAccount(int id) {
        accountService.deleteAccount(id);
        System.out.println("Conta nº " + id + " apagada com sucesso!");
    }
}