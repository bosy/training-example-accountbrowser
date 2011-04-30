/**
 * 
 */
package accountbrowser.DAO;

import java.util.HashMap;

import accountbrowser.domain.Account;
import accountbrowser.domain.Owner;

/**
 * @author Student
 * 
 */
public class HashmapAccountDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        Account a = new Account();
        a.setId(1);
        a.setBalance(1000);
        Owner o = new Owner();
        o.setName("David");
        a.setOwner(o);
        a.setState("approved");
        data.put(1, a);

        Account b = new Account();
        b.setId(2);
        b.setBalance(550);
        Owner o2 = new Owner();
        o2.setName("Svatopluk");
        b.setOwner(o2);
        b.setState("saved");
        data.put(2, b);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.DAO.AccountDAO#Fetch(int)
     */
    @Override
    public Account Fetch(int id) {

        return data.get(id);
    }

}
