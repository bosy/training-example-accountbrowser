/**
 * 
 */
package accountbrowser.dao;

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
                // throw new
            }
        }
        return INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();
}
