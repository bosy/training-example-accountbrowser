/**
 * 
 */
package accountbrowser.dao;

import accountbrowser.dao.hashmap.HashMapDAOFactory;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory INSTANCE;

    public synchronized static DAOFactory getInstance() {
        if (INSTANCE == null) {
            String property = System.getProperty("dao");
            if ("hashmap".equals(property)) {
                INSTANCE = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {
                // throw new Exception("not implemented yet");
            }
        }
        return INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();

}
