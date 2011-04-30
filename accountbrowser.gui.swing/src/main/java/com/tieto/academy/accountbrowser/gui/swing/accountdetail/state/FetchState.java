/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import javax.swing.JTextField;

import accountBrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class FetchState extends AbstractState {

    /**
     * @param account
     */
    public FetchState(Account account) {
        super(account);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #
     * initTxtAccountState(com.tieto.academy.accountbrowser.gui.swing.accountdetail
     * .AccountDetailFrame)
     */
    @Override
    public void initTxtAccountState(AccountDetailFrame frame) {
        // TODO Auto-generated method stub

        JTextField txtAccountState = frame.getTxtAccountState();
        txtAccountState.setEnabled(false);

        txtAccountState.setText(getAccount().get_state());
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
        // TODO Auto-generated method stub
        frame.getTxtBalance().setText(String.valueOf(getAccount().get_balance()));
        // frame.getTxtOwnersName().setText(getAccount().get_owner().get_name());
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
        // TODO Auto-generated method stub
        super.initTxtOwnersName(frame);
        frame.getTxtOwnersName().setText(String.valueOf(getAccount().get_owner().get_name()));
    }

}
