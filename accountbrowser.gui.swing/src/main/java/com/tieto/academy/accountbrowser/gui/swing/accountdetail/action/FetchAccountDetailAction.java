/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountBrowser.DAO.AccountDAO;
import accountBrowser.DAO.DAOFactory;
import accountBrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailAction extends accountDetailAbstractAction {

    /**
     * @param _frame
     */
    public FetchAccountDetailAction(AccountDetailFrame _frame, String name) {
        super(_frame, name);
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

        AccountDAO accountDAO = DAOFactory.getInstance().getAccountDAO();

        Integer cislo = Integer.valueOf(this.get_frame().getTxtAccountId().getText());

        Account account = accountDAO.fetch(cislo);

        // this.get_frame().getLblBalance().setText(String.valueOf(account.get_balance()));

        if (account != null) {
            if ("Approved".equals(account.get_state())) {
                this.get_frame().setState(new ApprovedState(account));
            } else if ("Saved".equals(account.get_state())) {
                this.get_frame().setState(new SavedState(account));
            }
        }

    }
}
