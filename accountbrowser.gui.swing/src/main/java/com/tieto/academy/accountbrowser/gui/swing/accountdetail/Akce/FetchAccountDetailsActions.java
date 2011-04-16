/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.Akce;

import java.awt.event.ActionEvent;

import accountbrowser.dao.abi002.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsActions extends AccountDetailAbstractAction {

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        String id = getFrame().getTxtAccountId().getText();
        Account account = daoFactory.getAccountDAO().fetch(Integer.parseInt(id));
        System.out.println(account.toString());

    }

    /**
     * @param frame
     * @param name
     */
    public FetchAccountDetailsActions(AccountDetailFrame frame, String name) {
        super(frame, name);

    }

}
