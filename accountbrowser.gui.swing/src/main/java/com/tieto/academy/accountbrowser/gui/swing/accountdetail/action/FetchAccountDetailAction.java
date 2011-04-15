/**
 * FetchAccountDetailAction.java Apr 13, 2011 11:04:13 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.dao.DaoFactory;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedAccountState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedAccountState;

/**
 * Action used to fetch the account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class FetchAccountDetailAction extends AccountDetailAbstractAction {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 8755458484766685750L;

    /**
     * Creates new instance.
     * 
     * @param frame
     *            frame
     * @param arg
     *            text displayed on the component
     */
    public FetchAccountDetailAction(final AccountDetailFrame frame, final String arg) {
        super(frame, arg);
    }

    /**
     * Performs the action.
     * 
     * @param arg0
     *            action event
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(final ActionEvent arg0) {
        final String accountId = this.getFrame().getTxtAccountId().getText();
        final Account account = DaoFactory.getInstance().getAccountDao().fetch(Integer.valueOf(accountId));
        if (account != null) {
            if ("Approved".equals(account.getState())) {
                this.getFrame().getStateHolder().setState(new ApprovedAccountState(account));
            } else if ("Saved".equals(account.getState())) {
                this.getFrame().getStateHolder().setState(new SavedAccountState(account));
            }
        }
    }
}
