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

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    AccountDetailFrame frame;

    public AccountDetailAbstractAction(AccountDetailFrame frame, String name) {
        super(name);
        this.frame = frame;
    }

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }
}
