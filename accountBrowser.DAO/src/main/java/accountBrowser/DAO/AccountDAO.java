/**
 * 
 */
package accountBrowser.DAO;

import accountBrowser.domain.Account;

/**
 * @author Student
 * 
 */
public interface AccountDAO {

    public abstract Account fetch(int pIdAccount);

}
