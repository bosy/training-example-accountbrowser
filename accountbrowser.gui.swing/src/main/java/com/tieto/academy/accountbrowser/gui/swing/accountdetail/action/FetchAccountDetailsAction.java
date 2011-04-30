/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountbrowser.dao.AccountDAO;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    private AccountDAO accountDAO;

    // = DAOFactory.getInstance().getAccountDAO();

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
        Integer id = Integer.valueOf(text);
        Account account = accountDAO.fetch(id);
        // state pattern is used
        if (account != null) {
            if ("Approved".equals(account.getState())) {
                getFrame().setState(new ApprovedState(account));
            } else if ("Saved".equals(account.getState())) {
                getFrame().setState(new SavedState(account));
            }
        }

    }

    /**
     * @param accountDAO
     *            the accountDAO to set
     */
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

}
