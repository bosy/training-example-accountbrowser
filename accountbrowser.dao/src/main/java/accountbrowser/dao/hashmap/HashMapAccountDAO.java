package accountbrowser.dao.hashmap;

import java.util.HashMap;

import accountbrowser.dao.AccountDAO;
import accountbrowser.domain.Account;
import accountbrowser.domain.Owner;

/**
 * 
 */

/**
 * @author Student
 * 
 */
public class HashMapAccountDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        // 1
        Account ac1 = new Account();
        ac1.setId(1);
        ac1.setBalance(100000);
        Owner owner = new Owner();
        owner.setName("Marek Stefkovic");
        ac1.setOwner(owner);
        ac1.setState("Saved");
        data.put(ac1.getId(), ac1);

        // 2
        Account ac2 = new Account();
        ac2.setId(2);
        ac2.setBalance(4964964);
        Owner owner2 = new Owner();
        owner2.setName("Jozko Mrkvicka");
        ac2.setOwner(owner2);
        ac2.setState("Approved");
        data.put(ac2.getId(), ac2);

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
