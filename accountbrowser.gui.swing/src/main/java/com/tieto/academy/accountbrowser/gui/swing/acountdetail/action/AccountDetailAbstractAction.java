/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.acountdetail.action;

import javax.swing.AbstractAction;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class AccountDetailAbstractAction extends AbstractAction {

    private AccountDetailFrame frame;

    /**
     * @param name
     */
    public AccountDetailAbstractAction(String name, AccountDetailFrame frame) {
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
