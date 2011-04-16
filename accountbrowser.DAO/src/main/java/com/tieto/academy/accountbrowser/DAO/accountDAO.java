/**
 * 
 */
package com.tieto.academy.accountbrowser.DAO;

import com.tieto.academy.accountbrowser.domain.Account;

/**
 * @author Student
 * 
 */
public interface AccountDAO {
    public Account fetch(int id);
}
