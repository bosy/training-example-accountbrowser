/**
 * 
 */
package accountbrowser.DAO;

/**
 * @author Student
 * 
 */
public class HashmapDAOFactory extends DAOFactory {

    /*
     * (non-Javadoc)
     * 
     * @see accountbrowser.DAO.DAOFactory#getAccountDAO()
     */
    @Override
    public AccountDAO getAccountDAO() {

        return new HashmapAccountDAO();
    }

}
