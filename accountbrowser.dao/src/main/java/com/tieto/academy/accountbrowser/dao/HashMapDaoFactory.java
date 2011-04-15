package com.tieto.academy.accountbrowser.dao;

import com.tieto.academy.accountbrowser.dao.hashmap.HashMapAccountDao;

/**
 * DAO factory for HashMap implementation.
 * 
 * @author Ondrej Kvasnovsky
 */
public class HashMapDaoFactory extends DaoFactory {

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.dao.DaoFactory#getAccountDao()
     */
    @Override
    public AccountDao getAccountDao() {
        return new HashMapAccountDao();
    }
}
