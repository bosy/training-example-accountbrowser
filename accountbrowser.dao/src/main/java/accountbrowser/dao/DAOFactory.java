/**
 * 
 */
package accountbrowser.dao;

import hashmap.HashMapDAOFactory;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory INSTANCE;

    public static DAOFactory getInstance() {

        if (INSTANCE == null) {
            String property = System.getProperty("dao");
            if ("hashmap".equals(property)) {
                INSTANCE = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {
                // do something useful
            }
        }
        return INSTANCE;
    }

    public abstract IAccountDAO getAccountDAO();
}
