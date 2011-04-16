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
        DAOFactory daoFactory = DAOFactory.getInstance();
        String text = getFrame().getTxtAccountId().getText();
        if (text.equals("")) {
            JOptionPane.showMessageDialog(getFrame(), "Fill in the value, please.");
            return;
        }
        Integer id = Integer.valueOf(text);
        Account fetch = daoFactory.getAccountDAO().fetch(id);
        getFrame().getTxtBalance().setText("" + fetch.getBalance());
        getFrame().getTxtOwnersName().setText("" + fetch.getOwner().getName());
        getFrame().getTxtAccountState().setText("" + fetch.getState());
    }

}
