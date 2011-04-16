/**
 * 
 */
package accountbrowser.dao.hashmap;

import accountbrowser.dao.AccountDAO;
import accountbrowser.dao.DAOFactory;

/**
 * @author Student
 * 
 */
public class HashMapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {
        // TODO Auto-generated method stub
        return new HashMapAccoutDAO();
    }

}
