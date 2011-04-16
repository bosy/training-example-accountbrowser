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

    public static synchronized DAOFactory getInstance() {
        if (INSTANCE == null) {
            String s = System.getProperty("dao");
            if ("hashmap".equals(s)) {
                INSTANCE = new HashMapDAOFactory();
            } else if ("mysql".equals(s)) {
                // throw new Exception("Not implemated");
            }
        }

        return INSTANCE;
    }
}
