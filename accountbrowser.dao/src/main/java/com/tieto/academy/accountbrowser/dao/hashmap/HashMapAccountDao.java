/**
 * HashMapAccountDao.java Apr 13, 2011 11:19:08 PM
 */
package com.tieto.academy.accountbrowser.dao.hashmap;

import java.util.HashMap;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.core.bc.Owner;
import com.tieto.academy.accountbrowser.dao.AccountDao;

/**
 * Dummy implementation of DAO. Data is store only in memory.
 * 
 * @author Ondrej Kvasnovsky
 */
public class HashMapAccountDao implements AccountDao {

    /**
     * data
     */
    private static final HashMap<Integer, Account> data = new HashMap<Integer, Account>();
    static {
        final Account account1 = new Account(new Owner("Ondrej Kvasnovsky"), 100);
        account1.setBalance(58081);
        account1.setCurrency("CZK");
        account1.setState("Approved");
        HashMapAccountDao.data.put(account1.getAccountNumber(), account1);
        final Account account2 = new Account(new Owner("Roman Bosak"), 101);
        account2.setBalance(58081);
        account2.setCurrency("CZK");
        account2.setState("Saved");
        HashMapAccountDao.data.put(account2.getAccountNumber(), account2);
    }

    /**
     * Creates new instance.
     */
    public HashMapAccountDao() {
        super();
    }

    /**
     * {@inheritDoc}
     * 
     * @param id
     *            id
     * @see com.tieto.academy.accountbrowser.dao.AccountDao#fetch(int)
     */
    public Account fetch(final int id) {
        return HashMapAccountDao.data.get(id);
    }

    /**
     * {@inheritDoc}
     * 
     * @param account
     * @see com.tieto.academy.accountbrowser.dao.AccountDao#save(com.tieto.academy.accountbrowser.core.bc.Account)
     */
    public void save(final Account account) {
        HashMapAccountDao.data.put(account.getAccountNumber(), account);
    }
}
