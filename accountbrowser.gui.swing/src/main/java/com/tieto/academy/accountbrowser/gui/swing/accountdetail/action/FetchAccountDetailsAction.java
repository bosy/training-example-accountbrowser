/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountbrowser.dao.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = -1416275905611051863L;

    /**
     * @param frame
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DAOFactory daofactory = DAOFactory.getInstance();
        int id = Integer.valueOf(getFrame().getTxtAccountId().getText());
        Account account = daofactory.getAccountDAO().fetchOne(id);
        System.out.println(account.toString());
    }
}
