/**
 * SaveAccountAction.java Apr 14, 2011 9:16:31 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.dao.DaoFactory;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * Action used to save the account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class SaveAccountAction extends AccountDetailAbstractAction {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7806101645635868546L;

    /**
     * Creates new instance.
     * 
     * @param frame
     *            frame
     * @param text
     *            text displayed on the component
     */
    public SaveAccountAction(final AccountDetailFrame frame, final String text) {
        super(frame, text);
    }

    /**
     * Performs the action.
     * 
     * @param arg0
     *            action event
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(final ActionEvent event) {
        final Account account = this.getFrame().getStateHolder().getState().getAccount();
        account.setState("Saved");
        account.getOwner().setName(this.getFrame().getTxtOwnersName().getText());
        DaoFactory.getInstance().getAccountDao().save(account);
    }
}
