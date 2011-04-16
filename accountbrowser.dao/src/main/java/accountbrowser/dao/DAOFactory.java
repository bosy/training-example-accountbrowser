/**
 * 
 */
package accountbrowser.dao;

import accountbrowser.dao.hashmap.HashMapDAOFactory;
import accountbrowser.dao.mysql.MySQLDAOFactory;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory INSTANCE;

    public static synchronized DAOFactory getInstance() {
        if (INSTANCE == null) {
            String property = System.getProperty("dao");

            if ("hashmap".equals(property)) {
                INSTANCE = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {
                INSTANCE = new MySQLDAOFactory();
            }
        }

        return INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();
}
