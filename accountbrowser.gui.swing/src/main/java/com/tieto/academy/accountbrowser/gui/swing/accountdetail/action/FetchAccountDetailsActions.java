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
public class FetchAccountDetailsActions extends AccountDetailAbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = -7081683576635902598L;

    /**
     * @param name
     */
    public FetchAccountDetailsActions(AccountDetailFrame frame, String name) {
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

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            String id = getFrame().getTxtAccountId().getText();
            Account account = daoFactory.getAccountDAO().fetch(Integer.parseInt(id));

            getFrame().getTxtOwnersName().setText(account.getOwner().getName());
            getFrame().getTxtBalance().setText(Integer.toString(account.getBalance()));
            getFrame().getTxtAccountState().setText(account.getState());

        } catch (Exception ex) {
            System.err.println(ex.getMessage());

            getFrame().getTxtOwnersName().setText("");
            getFrame().getTxtBalance().setText("");
        }
    }

}
