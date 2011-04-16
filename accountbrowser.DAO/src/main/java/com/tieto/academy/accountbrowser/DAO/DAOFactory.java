/**
 * 
 */
package com.tieto.academy.accountbrowser.DAO;

import com.tieto.academy.accountbrowser.DAO.Hashmap.HashmapDAOFactory;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory instance;

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            String property = System.getProperty("dao");
            if ("hashmap".equals(property)) {
                instance = new HashmapDAOFactory();
            } else if ("mysql".equals(property)) {
                // throw new Exception("MySQL not yet implemented");
            }
        }
        return instance;
    }

    public abstract AccountDAO getAccountDAO();
}
