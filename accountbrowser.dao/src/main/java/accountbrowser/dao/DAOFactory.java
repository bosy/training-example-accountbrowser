/**
 * 
 */
package accountbrowser.dao;

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
                instance = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {

            }
        }
        return instance;
    }
}
