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

    public AccountDetailAbstractAction(String name, AccountDetailFrame f) {
        super(name);
        frame = f;
    }

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }

}
