/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import javax.swing.JTextField;

import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class FetchedState extends AbstractState {

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #
     * initTxtAccountState(com.tieto.academy.accountbrowser.gui.swing.accountdetail
     * .AccountDetailFrame)
     */
    /**
     * @param account
     */
    public FetchedState(Account account) {
        super(account);

    }

    @Override
    public void initTxtAccountState(AccountDetailFrame frame) {
        JTextField txtAccountState = frame.getTxtAccountState();
        txtAccountState.setEnabled(false);
        txtAccountState.setText(getAccount().getState());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #initTxtBalance(com.tieto.academy.accountbrowser.gui.swing.accountdetail.
     * AccountDetailFrame)
     */
    @Override
    public void initTxtBalance(AccountDetailFrame frame) {
        JTextField txtBalance = frame.getTxtBalance();
        txtBalance.setEnabled(false);
        txtBalance.setText(getAccount().getBalance() + "");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #
     * initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail
     * .AccountDetailFrame)
     */
    @Override
    public void initTxtOwnersName(AccountDetailFrame frame) {
        JTextField txtOwner = frame.getTxtOwnersName();
        txtOwner.setEnabled(false);
        txtOwner.setText(getAccount().getOwner().getJmeno());
    }

}
