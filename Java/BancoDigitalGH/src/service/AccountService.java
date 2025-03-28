package service;

import dao.AccountDAO;
import entity.Account;

public class AccountService {
    private AccountDAO accountDAO = new AccountDAO();

    public void createAccount(int id, String owner, double balance) {
        Account account = new Account(id, owner, balance);
        accountDAO.save(account);
    }

    public Account getAccount(int id) {
        return accountDAO.findById(id);
    }

    public void deposit(int id, double amount) {
        Account account = accountDAO.findById(id);
        if (account != null) {
            account.deposit(amount);
            accountDAO.save(account);
        }
    }

    public void withdraw(int id, double amount) {
        Account account = accountDAO.findById(id);
        if (account != null) {
            account.withdraw(amount);
            accountDAO.save(account);
        }
    }

    public void deleteAccount(int id) {
        accountDAO.delete(id);
    }
}