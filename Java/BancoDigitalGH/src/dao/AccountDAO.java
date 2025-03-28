package dao;

import entity.Account;
import java.util.HashMap;
import java.util.Map;

public class AccountDAO {
    private Map<Integer, Account> accounts = new HashMap<>();

    public void save(Account account) {
        accounts.put(account.getId(), account);
    }

    public Account findById(int id) {
        return accounts.get(id);
    }

    public void delete(int id) {
        accounts.remove(id);
    }
}