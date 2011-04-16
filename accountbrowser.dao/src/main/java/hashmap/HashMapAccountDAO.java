/**
 * 
 */
package hashmap;

import java.util.HashMap;

import accountbrowser.dao.IAccountDAO;
import accountbrowser.domain.Account;
import accountbrowser.domain.Owner;

/**
 * @author Student
 * 
 */
public class HashMapAccountDAO implements IAccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        // 1
        Account account1 = new Account();
        account1.setId(100);
        account1.setBalance(1000000);
        Owner owner1 = new Owner();
        owner1.setName("Majkl Majklovic");
        account1.setOwner(owner1);
        account1.setState("Saved");
        HashMapAccountDAO.data.put(account1.getId(), account1);
        // 2
        Account account2 = new Account();
        account2.setId(200);
        account2.setBalance(2000000);
        Owner owner2 = new Owner();
        owner2.setName("Juraj Majklovic");
        account2.setOwner(owner2);
        account2.setState("Saved");
        HashMapAccountDAO.data.put(account2.getId(), account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.IAccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        return data.get(id);
    }

}
