/**
 * 
 */
package hashmap;

import accountbrowser.dao.DAOFactory;
import accountbrowser.dao.IAccountDAO;

/**
 * @author Student
 * 
 */
public class HashMapDAOFactory extends DAOFactory {

    /**
     * 
     */
    public HashMapDAOFactory() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.DAOFactory#getAccountDAO()
     */
    @Override
    public IAccountDAO getAccountDAO() {
        return new HashMapAccountDAO();
    }

}
