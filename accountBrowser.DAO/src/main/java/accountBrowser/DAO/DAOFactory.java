/**
 * 
 */
package accountBrowser.DAO;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    private static DAOFactory _INSTANCE;

    public static synchronized DAOFactory getInstance() {

        if (_INSTANCE == null) {

            String property = System.getProperty("dao");

            if ("hashmap".equals(property)) {
                _INSTANCE = new HashMapDAOFactory();
            } else if ("mysql".equals(property)) {
                _INSTANCE = new HashMapDAOFactory();
            }

        }

        return _INSTANCE;
    }

    public abstract AccountDAO getAccountDAO();

}
