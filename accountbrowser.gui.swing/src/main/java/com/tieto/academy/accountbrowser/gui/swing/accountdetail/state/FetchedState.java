/**
 * FetchedState.java Apr 14, 2011 8:08:14 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.core.bc.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * State for fetched account. This class can't be instanciated. FetchedState is
 * meant to be extened by states like {@link ApprovedAccountState},
 * {@link SavedAccountState}...
 * 
 * @author Ondrej Kvasnovsky
 */
public abstract class FetchedState extends AbstractState {

    /**
     * Creates new instance.
     * 
     * @param account
     *            account
     */
    public FetchedState(final Account account) {
        super();
        this.setAccount(account);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initLblCurrency(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initLblCurrency(final AccountDetailFrame frame) {
        frame.getLblCurrency().setText(this.getAccount().getCurrency());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initTxtAccountState(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initTxtAccountState(final AccountDetailFrame frame) {
        frame.getTxtAccountState().setText(this.getAccount().getState());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initTxtBalance(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initTxtBalance(final AccountDetailFrame frame) {
        frame.getTxtBalance().setText(String.valueOf(this.getAccount().getBalance()));
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState#initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame)
     */
    @Override
    public void initTxtOwnersName(final AccountDetailFrame frame) {
        frame.getTxtOwnersName().setText(this.getAccount().getOwner().getName());
    }
}
