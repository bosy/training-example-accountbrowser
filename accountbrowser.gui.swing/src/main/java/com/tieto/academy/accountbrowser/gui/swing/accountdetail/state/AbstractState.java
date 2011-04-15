/**
 * AbstractState.java Apr 13, 2011 10:08:56 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * Default implementation of the state for {@link AccountDetailFrame}.
 * 
 * @author Ondrej Kvasnovsky
 */
public abstract class AbstractState implements State {

    /**
     * business class
     */
    private Account account;

    /**
     * Returns account.
     * 
     * @return the account
     */
    public final Account getAccount() {
        return this.account;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initBtnApprove(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initBtnApprove(final AccountDetailFrame frame) {
        frame.getBtnApprove().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initBtnFetchAccountDetails(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initBtnFetchAccountDetails(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initBtnSave(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initBtnSave(final AccountDetailFrame frame) {
        frame.getBtnSave().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initLblAccountId(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initLblAccountId(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initLblAccountState(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initLblAccountState(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initLblBalance(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initLblBalance(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initLblCurrency(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initLblCurrency(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initLblOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initLblOwnersName(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initPnlAccountDetails(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initPnlAccountDetails(final AccountDetailFrame frame) {
        frame.getPnlAccountDetails().setEnabled(true);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initPnlMain(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initPnlMain(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initTxtAccountId(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initTxtAccountId(final AccountDetailFrame frame) {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initTxtAccountState(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initTxtAccountState(final AccountDetailFrame frame) {
        frame.getTxtAccountState().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initTxtBalance(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initTxtBalance(final AccountDetailFrame frame) {
        frame.getTxtBalance().setEnabled(false);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.State#initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    public void initTxtOwnersName(final AccountDetailFrame frame) {
        frame.getTxtOwnersName().setEnabled(false);
    }

    /**
     * Set the account.
     * 
     * @param account
     *            the account to set
     */
    public void setAccount(final Account account) {
        this.account = account;
    }
}
