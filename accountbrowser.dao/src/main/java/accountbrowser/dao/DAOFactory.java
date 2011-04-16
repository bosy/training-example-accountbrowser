/**
 * 
 */
package accountbrowser.dao;

import hashmap.HashmapDAOFactory;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory INSTANCE;

    public synchronized static DAOFactory getInstance() throws Exception {
        if (null == INSTANCE) {
            String dao = System.getProperty("dao");
            if ("hashmap".equalsIgnoreCase(dao)) {
                INSTANCE = new HashmapDAOFactory();
            } else {
                throw new Exception("No class definition found for dao = " + dao);
            }
        }
        return INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();

}
