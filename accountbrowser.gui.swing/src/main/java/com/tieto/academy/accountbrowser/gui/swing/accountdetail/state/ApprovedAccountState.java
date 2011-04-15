/**
 * ApprovedAccountState.java Apr 13, 2011 10:10:57 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * State for approved account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class ApprovedAccountState extends FetchedState {

    /**
     * Creates new instance.
     * 
     * @param account
     *            account
     */
    public ApprovedAccountState(final Account account) {
        super(account);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.FetchedState#initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initTxtOwnersName(final AccountDetailFrame frame) {
        super.initTxtOwnersName(frame);
        frame.getTxtOwnersName().setEnabled(false);
    }
}
