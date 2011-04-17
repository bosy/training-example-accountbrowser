/**
 * 
 */
package accountbrowser.dao;

import accountbrowser.dao.hashmap.HashmapDAOFactory;

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
                INSTANCE = new HashmapDAOFactory();
            } else {

            }

        }
        return INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();

}
