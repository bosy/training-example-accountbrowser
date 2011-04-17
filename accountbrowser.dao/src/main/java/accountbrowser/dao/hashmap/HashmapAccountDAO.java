/**
 * 
 */
package accountbrowser.dao.hashmap;

import java.util.HashMap;

import accountbrowser.dao.AccountDAO;
import accountbrowser.domain.Account;
import accountbrowser.domain.Owner;

/**
 * @author Student
 * 
 */
public class HashmapAccountDAO implements AccountDAO {
    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        // 1
        Account account1 = new Account();
        account1.setBalance(900000);
        Owner owner1 = new Owner();
        owner1.setName("Petr Hantak");
        account1.setOwner(owner1);
        account1.setState("Saved");
        account1.setId(100);
        data.put(account1.getId(), account1);
        // 2
        Account account2 = new Account();
        account2.setBalance(50);
        Owner owner2 = new Owner();
        owner2.setName("Jan Kopriva");
        account2.setOwner(owner1);
        account2.setState("Approved");
        account2.setId(101);
        data.put(account2.getId(), account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        return data.get(id);
    }

}
