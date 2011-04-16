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
        // 1
        Owner owner1 = new Owner();
        owner1.setName("Lukas Satin");
        Account account1 = new Account();
        account1.setId(100);
        account1.setBalance(1000000);
        account1.setState("Saved");
        account1.setOwner(owner1);
        data.put(account1.getId(), account1);

        // 2
        Owner owner2 = new Owner();
        owner2.setName("Chudy funik");
        Account account2 = new Account();
        account2.setId(101);
        account2.setBalance(100);
        account2.setState("Approved");
        account2.setOwner(owner2);
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