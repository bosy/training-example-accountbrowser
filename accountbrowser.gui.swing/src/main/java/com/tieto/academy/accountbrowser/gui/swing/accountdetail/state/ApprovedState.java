/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class ApprovedState extends FetchedState {

    /**
     * @param account
     */
    public ApprovedState(Account account) {
        super(account);
        // TODO Auto-generated constructor stub
    }

    public void initTxtOwnersName(AccountDetailFrame frame) {
        // TODO Auto-generated method stub
        super.initTxtOwnersName(frame);
        frame.getTxtOwnersName().setEnabled(false);
        frame.getTxtAccountState().setText(getAccount().getState());
    }

    /**
     * 
     */

    /**
     * 
     */

}
