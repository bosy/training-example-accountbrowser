/**
 * SavedAccountState.java Apr 13, 2011 10:10:04 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Ondrej Kvasnovsky
 * 
 */
public class SavedAccountState extends FetchedState {

    public SavedAccountState(final Account account) {
        super(account);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initBtnApprove(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initBtnApprove(final AccountDetailFrame frame) {
        frame.getBtnApprove().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initBtnSave(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initBtnSave(final AccountDetailFrame frame) {
        frame.getBtnSave().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.FetchedState#initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initTxtOwnersName(final AccountDetailFrame frame) {
        super.initTxtOwnersName(frame);
        frame.getTxtOwnersName().setEnabled(true);
    }
}
