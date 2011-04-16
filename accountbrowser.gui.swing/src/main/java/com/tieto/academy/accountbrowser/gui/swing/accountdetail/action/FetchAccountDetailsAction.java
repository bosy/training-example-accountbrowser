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
     * 
     */
    private static final long serialVersionUID = 1L;

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Fetch account");
        // DaoFactory df

    }

    /**
     * @param name
     */
    public FetchAccountDetailsAction(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

}
