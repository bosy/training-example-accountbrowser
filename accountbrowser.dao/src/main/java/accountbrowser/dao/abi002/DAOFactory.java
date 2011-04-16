/**
 * 
 */
package accountbrowser.dao.abi002;

/**
 * @author Student
 * 
 */
public abstract class DAOFactory {
    private static DAOFactory instance;

    public static synchronized DAOFactory getInstance() {
        String property = System.getProperty("dao");
        if ("hashmap".equals(property)) {
            instance = new HashMapDAOFactory();
        } else if ("mysql".equals(property)) {
            // throw new T("not implement yet");
        }
        return instance;
    }
}
