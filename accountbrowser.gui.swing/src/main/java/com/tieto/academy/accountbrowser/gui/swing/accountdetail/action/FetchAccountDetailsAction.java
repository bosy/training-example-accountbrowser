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

    /**
     * 
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("fetch account");
        // DAOFactory daoFactory =
        // DAOFactory.getInstance().getAccountDAO().fetch
    }

}
