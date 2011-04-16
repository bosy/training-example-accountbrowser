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
public class FetchAccountDetailAction extends AbstractAction {

    /**
     * @param name
     */
    public FetchAccountDetailAction(String name) {
        super(name);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("HELLO");

    }

}
