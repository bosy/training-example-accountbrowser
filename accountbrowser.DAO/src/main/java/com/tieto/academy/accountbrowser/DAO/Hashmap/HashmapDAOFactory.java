/**
 * 
 */
package com.tieto.academy.accountbrowser.DAO.Hashmap;

import com.tieto.academy.accountbrowser.DAO.AccountDAO;
import com.tieto.academy.accountbrowser.DAO.DAOFactory;

/**
 * @author Student
 * 
 */
public class HashmapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see com.tieto.academy.accountbrowser.DAO.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {
        return new HashmapAccountDAO();
    }

}
