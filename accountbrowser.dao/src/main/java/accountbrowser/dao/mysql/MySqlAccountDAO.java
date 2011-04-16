/**
 * 
 */
package accountbrowser.dao.mysql;

import accountbrowser.dao.AccountDAO;
import accountbrowser.domain.Account;

/**
 * @author Student
 * 
 */
public class MySqlAccountDAO implements AccountDAO {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM Account";
        // connect to mysql...
        // create Account
        return null;
    }

}
