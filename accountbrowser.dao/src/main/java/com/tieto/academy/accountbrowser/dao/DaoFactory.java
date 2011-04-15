/**
 * DaoFactory.java Apr 13, 2011 11:06:21 PM
 */
package com.tieto.academy.accountbrowser.dao;

/**
 * Data access object (DAO) pattern is used (more info:
 * http://java.sun.com/blueprints
 * /corej2eepatterns/Patterns/DataAccessObject.html).
 * 
 * @author Ondrej Kvasnovsky
 */
public abstract class DaoFactory {

    /**
     * singleton instance
     */
    private static DaoFactory INSTANCE;

    /**
     * Returns instance of the DAO factory.
     * 
     * @return DAO factory
     */
    public static synchronized DaoFactory getInstance() {
        if (DaoFactory.INSTANCE == null) {
            String dao = System.getProperty("dao");
            if ("hashmap".equals(dao)) {
                DaoFactory.INSTANCE = new HashMapDaoFactory();
            }
        }
        return DaoFactory.INSTANCE;
    }

    /**
     * Creates new instance.
     */
    public DaoFactory() {
        super();
    }

    /**
     * Returns DAO for account.
     * 
     * @return account DAO
     */
    public abstract AccountDao getAccountDao();
}
