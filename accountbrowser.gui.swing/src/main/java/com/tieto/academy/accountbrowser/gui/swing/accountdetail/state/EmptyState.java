/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import javax.swing.JButton;
import javax.swing.JTextField;

import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class EmptyState extends AbstractState {

    /**
     * @param account
     */
    public EmptyState(Account account) {
        super(account);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param account
     */
    public EmptyState() {
        super(null);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #initBtnApprove(com.tieto.academy.accountbrowser.gui.swing.accountdetail.
     * AccountDetailFrame)
     */
    @Override
    public void initBtnApprove(AccountDetailFrame frame) {
        JButton btnApprove = frame.getBtnApprove();
        btnApprove.setEnabled(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.AbstractState
     * #initBtnSave(com.tieto.academy.accountbrowser.gui.swing.accountdetail.
     * AccountDetailFrame)
     */
    @Override
    public void initBtnSave(AccountDetailFrame frame) {
        JButton btnSave = frame.getBtnSave();
        btnSave.setEnabled(false);
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
        txtAccountState.setText("");
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
        txtBalance.setText("");
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
        JTextField txtOwnersName = frame.getTxtOwnersName();
        txtOwnersName.setEnabled(false);
        txtOwnersName.setText("");
    }

}
