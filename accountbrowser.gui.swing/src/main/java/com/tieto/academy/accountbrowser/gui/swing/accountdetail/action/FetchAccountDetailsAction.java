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

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DAOFactory dao = DAOFactory.getInstance();
        String id = getFrame().getTxtAccountId().getText();
        Account account = dao.getAccountDAO().fetch(Integer.parseInt(id));
        System.out.println(account.toString());

        getFrame().getTxtAccountState().setText(account.getState());
        getFrame().getTxtBalance().setText(account.getBalance() + "");
        getFrame().getTxtOwnersName().setText(account.getOwner().getName());

    }

    /**
     * @param frame
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);
        // TODO Auto-generated constructor stub
    }

}
