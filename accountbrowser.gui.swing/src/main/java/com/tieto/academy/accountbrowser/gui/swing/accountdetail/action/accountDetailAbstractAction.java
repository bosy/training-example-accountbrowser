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
public abstract class accountDetailAbstractAction extends AbstractAction {

    private AccountDetailFrame _frame;

    /**
     * @return the _frame
     */
    public AccountDetailFrame get_frame() {
        return _frame;
    }

    /**
     * @param _frame
     */
    public accountDetailAbstractAction(AccountDetailFrame _frame, String name) {
        super(name);
        this._frame = _frame;
    }

}
