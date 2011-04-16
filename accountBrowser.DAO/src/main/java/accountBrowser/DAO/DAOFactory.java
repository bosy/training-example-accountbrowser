/**
 * 
 */
package accountBrowser.DAO;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory _instance;

    public static synchronized DAOFactory getInstance() {

        if (_instance == null) {

            String property = System.getProperty("dao");

            if ("hashmap".equals(property)) {
                _instance = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {
                _instance = new HashMapDAOFactory();
            }

        }

        return _instance;
    }

}
