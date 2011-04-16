/**
 * 
 */
package accountBrowser.DAO;

import java.util.HashMap;

import accountBrowser.domain.Account;
import accountBrowser.domain.Owner;

/**
 * @author Student
 * 
 */
public class HashMapAccountDAO implements AccountDAO {

    private static HashMap<Integer, Account> data = new HashMap<Integer, Account>();

    static {
        Owner owner = new Owner();
        owner.set_name("Adino");

        Account account = new Account();
        account.set_balance(10000);
        account.set_id(2);
        account.set_state("Saved");
        account.set_owner(owner);

        data.put(account.get_id(), account);

        owner = new Owner();
        owner.set_name("Kenny");

        account = new Account();
        account.set_balance(2);
        account.set_id(2);
        account.set_state("Saved");
        account.set_owner(owner);

        data.put(account.get_id(), account);
    }

    /*
     * (non-Javadoc)
     * 
     * @see accountBrowser.DAO.AccountDAO#fetch(int)
     */
    @Override
    public Account fetch(int pIdAccount) {
        // TODO Auto-generated method stub
        return data.get(pIdAccount);
    }

}
