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

    /**
     * @param name
     */
    public FetchAccountDetailsAction(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // DAOFactory daoFactory =
        // DAOFactory.getInstance().getAccountDAO().fetch();
    }

}
