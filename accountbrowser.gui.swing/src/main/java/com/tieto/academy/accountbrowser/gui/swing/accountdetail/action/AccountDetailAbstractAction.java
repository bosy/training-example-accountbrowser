/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public abstract class AccountDetailAbstractAction extends AbstractAction {

    private AccountDetailFrame frame;

    /**
     * 
     */
    private static final long serialVersionUID = -4861231270278915474L;

    /**
     * 
     */
    public AccountDetailAbstractAction(AccountDetailFrame frame) {
        this.frame = frame;
    }

    /**
     * @param name
     */
    public AccountDetailAbstractAction(AccountDetailFrame frame, String name) {
        super(name);
        this.frame = frame;
    }

    /**
     * @param name
     * @param icon
     */
    public AccountDetailAbstractAction(AccountDetailFrame frame, String name, Icon icon) {
        super(name, icon);
        this.frame = frame;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }

}
