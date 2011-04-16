/**
 * 
 */
package com.tieto.academy.accountbrowser.DAO;

/**
 * @author Student
 * 
 */
public class DAOFactory {

    private static DAOFactory instance;

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            String property = System.getProperty("dao");
            if ("hashmap".equals(property)) {
                instance = new HashmapDAOFactory();
            } else if ("mysql".equals(property)) {

            }
        }
        return instance;
    }
}
