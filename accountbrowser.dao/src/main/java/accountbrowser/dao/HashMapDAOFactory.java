/**
 * 
 */
package accountbrowser.dao;

/**
 * @author Student
 * 
 */
public class HashMapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.dao.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {
        // TODO Auto-generated method stub
        return new HashMapAccountDAO();
    }

}
