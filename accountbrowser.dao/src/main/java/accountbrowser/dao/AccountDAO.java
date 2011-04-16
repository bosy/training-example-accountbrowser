/**
 * 
 */
package accountbrowser.dao;

import accountbrowser.domain.Account;

/**
 * @author Student
 * 
 */
public interface AccountDAO {
    Account fetchOne(int id);
}
