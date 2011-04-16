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

    public AccountDetailAbstractAction(AccountDetailFrame frame, String name) {
        super(name);
        this.frame = frame;
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }

    /**
     * @param frame
     *            the frame to set
     */
    public void setFrame(AccountDetailFrame frame) {
        this.frame = frame;
    }

}
