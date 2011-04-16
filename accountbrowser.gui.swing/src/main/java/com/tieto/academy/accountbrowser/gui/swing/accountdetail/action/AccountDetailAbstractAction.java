/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

import accountbrowser.dao.DAOFactory;

/**
 * @author Student
 * 
 */
public abstract class AccountDetailAbstractAction extends AbstractAction {

     private AccountDetailFrame frame;
    

    /**
     * @param name
     */
    public AccountDetailAbstractAction(AccountDetailFrame frame,String name) {
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
