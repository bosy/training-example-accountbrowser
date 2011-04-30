/**
 * 
 */
package com.tieto.academy.accountbrowser.DAO.Hashmap;

import java.util.HashMap;

import com.tieto.academy.accountbrowser.DAO.AccountDAO;
import com.tieto.academy.accountbrowser.domain.Account;
import com.tieto.academy.accountbrowser.domain.Owner;

/**
 * @author Student
 * 
 */
public class HashmapAccountDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        Account account1 = new Account(1, "Saved", 124, new Owner("Robert Saniga"));
        Account account2 = new Account(2, "Saved", 1512205533, new Owner("Bill Gates"));

        data.put(1, account1);
        data.put(2, account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.tieto.academy.accountbrowser.DAO.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        return data.get(id);
    }

}
