/**
 * 
 */
package hashmap;

import accountbrowser.dao.AccountDAO;
import accountbrowser.dao.DAOFactory;

/**
 * @author Student
 * 
 */
public class HashmapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {
        return new HashmapAccountDAO();
    }

}
