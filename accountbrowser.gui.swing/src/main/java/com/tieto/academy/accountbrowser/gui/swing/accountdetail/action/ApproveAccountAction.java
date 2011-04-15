/**
 * ApproveAccountAction.java Apr 14, 2011 9:26:26 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.dao.DaoFactory;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedAccountState;

/**
 * Action used to approve the account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class ApproveAccountAction extends AccountDetailAbstractAction {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 8474200697662721255L;

    /**
     * Creates new instance.
     * 
     * @param frame
     *            frame
     * @param text
     *            text displayed on the component
     */
    public ApproveAccountAction(final AccountDetailFrame frame, final String text) {
        super(frame, text);
    }

    /**
     * Performs the action.
     * 
     * @param arg0
     *            action event
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(final ActionEvent arg0) {
        final Account account = this.getFrame().getStateHolder().getState().getAccount();
        account.setState("Approved");
        account.getOwner().setName(this.getFrame().getTxtOwnersName().getText());
        DaoFactory.getInstance().getAccountDao().save(account);
        this.getFrame().getStateHolder().setState(new ApprovedAccountState(account));
    }
}
