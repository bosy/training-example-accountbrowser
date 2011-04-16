/**
 * 
 */
package accountbrowser.dao.hashmap;

import accountbrowser.dao.abi002.AccountDAO;
import accountbrowser.dao.abi002.DAOFactory;

/**
 * @author Student
 * 
 */
public class HashMapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.abi002.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {

        return new HashMapAccountDAO();
    }

}
