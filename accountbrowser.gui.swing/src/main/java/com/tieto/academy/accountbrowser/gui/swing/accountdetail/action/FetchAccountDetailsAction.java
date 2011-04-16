/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AbstractAction {

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // DAOFactory daoFactory =
        // DAOFactory.getInstance().getAccountDAI().fetch();
    }

    /**
     * @param arg0
     */
    public FetchAccountDetailsAction(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

}
