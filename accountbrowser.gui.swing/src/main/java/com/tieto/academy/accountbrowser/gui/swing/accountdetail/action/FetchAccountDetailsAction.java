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
     * @param frame
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("fetch account");
        DAOFactory daoFactory = DAOFactory.getInstance();
        String text = getFrame().getTxtAccountId().getText();
        Integer id = Integer.valueOf(text);
        Account account = daoFactory.getAccountDAO().fetch(id);
        getFrame().getTxtAccountState().setText(account.getState());

    }
}
