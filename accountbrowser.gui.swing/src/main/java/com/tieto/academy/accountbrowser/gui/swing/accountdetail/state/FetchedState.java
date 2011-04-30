/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import javax.swing.JTextField;

import com.tieto.academy.accountbrowser.domain.Account;
import com.tieto.academy.accountbrowser.domain.Owner;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class FetchedState extends AbstractState {

    /**
     * @param account
     */
    public FetchedState(Account account) {
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
        frame.getTxtBalance().setText(getAccount().getBalance() + "");
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
        Owner owner = getAccount().getOwner();
        frame.getTxtOwnersName().setText(owner.getName());
    }

}
