/**
 * 
 */
package hashmap;

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

        Owner owner = new Owner();
        owner.setName("Jura");
        Account account = new Account();
        account.setBalance(100);
        account.setId(0);
        account.setState("saved");
        account.setOwner(owner);
        data.put(account.getId(), account);

        owner = new Owner();
        owner.setName("Josef");
        account = new Account();
        account.setBalance(250);
        account.setId(1);
        account.setState("saved");
        account.setOwner(owner);
        data.put(account.getId(), account);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int id) {
        // TODO Auto-generated method stub
        return HashmapAccountDAO.data.get(id);
    }

}
