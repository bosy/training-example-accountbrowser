/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.Akce;

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
    private AccountDetailFrame frame;

    public AccountDetailAbstractAction() {

    }

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
