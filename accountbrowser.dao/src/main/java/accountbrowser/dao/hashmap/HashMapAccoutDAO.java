/**
 * 
 */
package accountbrowser.dao.hashmap;

import java.util.HashMap;

import accountbrowser.core.Account;
import accountbrowser.core.Owner;
import accountbrowser.dao.AccountDAO;

/**
 * @author Student
 * 
 */
public class HashMapAccoutDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        Account account1 = new Account();
        account1.setId(100);
        account1.setBalance(100000);
        Owner o = new Owner();
        o.setName("Ondrej Stankovic");
        account1.setOwner(o);
        account1.setState("Saved");
        data.put(account1.getId(), account1);

        Account account2 = new Account();
        account2.setId(101);
        account2.setBalance(100000);
        Owner o2 = new Owner();
        o2.setName("Jan Zizka");
        account2.setOwner(o2);
        account2.setState("Approved");
        data.put(account2.getId(), account2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        // TODO Auto-generated method stub
        return data.get(id);
    }

}
