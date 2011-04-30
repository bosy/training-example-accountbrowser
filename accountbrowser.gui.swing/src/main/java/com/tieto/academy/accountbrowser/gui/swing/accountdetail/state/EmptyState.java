/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import javax.swing.JTextField;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class EmptyState extends AbstractState {

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
        frame.getBtnApprove().setEnabled(false);
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
        frame.getBtnSave().setEnabled(false);
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
