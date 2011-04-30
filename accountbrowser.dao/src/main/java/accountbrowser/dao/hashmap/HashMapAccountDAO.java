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
public class HashMapAccountDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        Account account1 = new Account();
        account1.setId(1);
        account1.setBalance(99999997);
        account1.setState("Saved");
        Owner owner = new Owner();
        owner.setName("pepa");
        account1.setOwner(owner);
        data.put(account1.getId(), account1);

        Account account2 = new Account();
        account2.setId(2);
        account2.setBalance(10);
        account2.setState("Approved");
        Owner owner2 = new Owner();
        owner2.setName("ruda");
        account2.setOwner(owner);
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
