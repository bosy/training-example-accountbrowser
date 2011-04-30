/**
 * 
 */
package accountbrowser.dao.hashmap;

import java.util.HashMap;

import accountbrowser.dao.abi002.AccountDAO;
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
        account1.setBalance(1000000);
        Owner owner1 = new Owner();
        owner1.setJmeno("Anton Abik");
        account1.setOwner(owner1);
        account1.setState("Saved");
        data.put(account1.getId(), account1);

        Account account2 = new Account();
        account2.setId(2);
        account2.setBalance(55000);
        Owner owner2 = new Owner();
        owner2.setJmeno("jozko mrkvicka");
        account2.setOwner(owner2);
        account2.setState("Saved");
        data.put(account2.getId(), account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.abi002.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        return data.get(id);
    }

}
