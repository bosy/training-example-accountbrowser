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
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = getFrame().getTxtAccountId().getText();
        if ("".equals(text)) {
            JOptionPane.showMessageDialog(getFrame(), "fill in the field :)", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DAOFactory daoFactory = DAOFactory.getInstance();
        Integer id = Integer.valueOf(text);
        Account account = daoFactory.getAccountDAO().fetch(id);
        // TODO: implement state pattern

        getFrame().getTxtAccountState().setText(account.getState());
        getFrame().getTxtAccountState().setEditable(false);

    }

}
