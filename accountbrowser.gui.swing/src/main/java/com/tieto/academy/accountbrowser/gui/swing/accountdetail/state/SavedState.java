/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import accountBrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public final class SavedState extends FetchState {

    /**
     * @param account
     */
    public SavedState(Account account) {
        super(account);
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
        // TODO Auto-generated method stub
        frame.getBtnApprove().setEnabled(true);

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
        // TODO Auto-generated method stub
        frame.getBtnSave().setEnabled(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.FetchState
     * #
     * initTxtOwnersName(com.tieto.academy.accountbrowser.gui.swing.accountdetail
     * .AccountDetailFrame)
     */
    @Override
    public void initTxtOwnersName(AccountDetailFrame frame) {
        super.initTxtOwnersName(frame);
        frame.getTxtOwnersName().setEnabled(true);
        frame.getTxtOwnersName().setText(getAccount().get_owner().get_name());
    }

}
