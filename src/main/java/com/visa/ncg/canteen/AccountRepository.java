package com.visa.ncg.canteen;

import java.util.HashMap;
import java.util.List;

public class AccountRepository {

    private HashMap<Long, Account> AccountMap;

    public AccountRepository(List<Account> accountList){
       AccountMap = new HashMap<Long, Account>();
       for (int i = 0; i < accountList.size(); i++){
           AccountMap.put(accountList.get(i).getID(), accountList.get(i));
           System.out.println("id inserted: "+ accountList.get(i).getID());
       }
    }

    public Account findOne(Long id) {
        // returns the Account that has the given id,
        // if there's no Account with that id, return null
        if (AccountMap.containsKey(id)){
            return AccountMap.get(id);
        }
        return null;
    }

    public Account save(Account entity) {
        // if account's id is already set, DON'T replace it
        // if the account came in with NO id, replace it with one generated from AtomicLong.
        // return the Account object that must now have its id set
        return null;
    }

    public List<Account> findAll() {
        // return all accounts as a List, or an empty List if there are no accounts
        return null;
    }

}