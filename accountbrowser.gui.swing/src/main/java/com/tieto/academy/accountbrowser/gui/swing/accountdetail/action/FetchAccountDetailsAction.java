/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountbrowser.core.Account;
import accountbrowser.dao.DAOFactory;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    /**
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.print("AKCE");
        DAOFactory daoFactory = DAOFactory.getInstance();
        String text = getFrame().getTxtAccountId().getText();
        Integer id = Integer.valueOf(text);
        Account a = daoFactory.getAccountDAO().fetch(id);

        getFrame().getTxtAccountState().setText(a.getState());
        getFrame().getTxtOwnersName().setText(a.getOwner().getName());
        getFrame().getTxtBalance().setText(String.valueOf(a.getBalance()));

    }

}
