/**
 * AccountDao.java Apr 13, 2011 11:17:37 PM
 */
package com.tieto.academy.accountbrowser.dao;

import com.tieto.academy.accountbrowser.core.bc.Account;

/**
 * DAO for Account.
 * 
 * @author Ondrej Kvasnovsky
 */
public interface AccountDao {

    /**
     * Fetches the account.
     * 
     * @param id
     *            id
     * @return fetched account
     */
    public Account fetch(int id);

    /**
     * Saves the account.
     * 
     * @param account
     *            account to be saved
     */
    public void save(Account account);
}
