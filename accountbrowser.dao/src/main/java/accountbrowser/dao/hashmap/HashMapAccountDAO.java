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
        account1.setBalance(10000);
        account1.setState("Saved");
        Owner owner1 = new Owner();
        owner1.setName("david lesnik");
        account1.setOwner(owner1);
        HashMapAccountDAO.data.put(account1.getId(), account1);

        Account account2 = new Account();
        account2.setId(2);
        account2.setBalance(5000);
        account2.setState("Approved");
        Owner owner2 = new Owner();
        owner2.setName("franta");
        account2.setOwner(owner2);
        HashMapAccountDAO.data.put(account2.getId(), account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.AccountDAO#fetchOne(int)
     */
    @Override
    public Account fetchOne(int id) {
        return HashMapAccountDAO.data.get(id);
    }

}
