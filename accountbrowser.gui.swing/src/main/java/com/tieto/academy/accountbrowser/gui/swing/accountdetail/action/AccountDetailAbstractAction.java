/**
 * AccountDetailAbstractAction.java Apr 13, 2011 10:03:31 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import javax.swing.AbstractAction;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * Abstract action providing access to the GUI frame.
 * 
 * @author Ondrej Kvasnovsky
 */
public abstract class AccountDetailAbstractAction extends AbstractAction {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3718730531177995344L;
    /**
     * frame
     */
    private final AccountDetailFrame frame;

    /**
     * Creates new instance.
     * 
     * @param frame
     *            frame
     * @param text
     *            text displayed on the component
     */
    public AccountDetailAbstractAction(final AccountDetailFrame frame, final String text) {
        super(text);
        this.frame = frame;
    }

    /**
     * Returns frame.
     * 
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return this.frame;
    }
}
