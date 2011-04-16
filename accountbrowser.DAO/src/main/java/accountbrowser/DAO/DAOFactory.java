/**
 * 
 */
package accountbrowser.DAO;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {

    static DAOFactory instance;

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            String value = System.getProperty("dao");
            if ("hashmap".equals(value)) {
                instance = new HashmapDAOFactory();
            } else if ("mysql".equals(value)) {

            }
        }
        return instance;
    }

}
