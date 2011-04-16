/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import javax.swing.AbstractAction;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class AccountDetailAbstractAction extends AbstractAction {

    private AccountDetailFrame frame;

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }

    /**
     * @param arg0
     */
    public AccountDetailAbstractAction(AccountDetailFrame frame, String arg0) {
        super(arg0);
        this.frame = frame;
    }

}
