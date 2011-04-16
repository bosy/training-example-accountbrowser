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
    public AccountDAO getAccountDAO() {
        return new HashMapAccountDAO();
    }
}
