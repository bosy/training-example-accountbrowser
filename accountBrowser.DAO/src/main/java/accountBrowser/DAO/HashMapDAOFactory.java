/**
 * 
 */
package accountBrowser.DAO;

/**
 * @author Student
 * 
 */
public class HashMapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountBrowser.DAO.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {
        // TODO Auto-generated method stub
        return new HashMapAccountDAO();
    }

}
