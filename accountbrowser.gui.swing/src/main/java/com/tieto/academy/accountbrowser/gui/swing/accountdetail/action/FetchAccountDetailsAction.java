/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import accountbrowser.dao.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    /**
     * @param frame
     * @param arg0
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String arg0) {
        super(frame, arg0);
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
        DAOFactory daoFactory = DAOFactory.getInstance();
        String id = getFrame().getTxtAccountId().getText();
        if ("".equals(id)) {
            JOptionPane.showMessageDialog(getFrame(), "bad joke o_0");
            return;
        }
        Account accountData = daoFactory.getAccountDAO().fetch(Integer.parseInt(id));
        getFrame().getTxtOwnersName().setText(accountData.getOwner().getName());
        getFrame().getTxtBalance().setText(String.valueOf(accountData.getBalance()));
        getFrame().getTxtAccountState().setText(accountData.getState());
    }
}