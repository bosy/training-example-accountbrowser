/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import accountbrowser.dao.DAOFactory;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = -3732933771571815326L;

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DAOFactory daofactory = DAOFactory.getInstance();

    }

    /**
     * @param name
     */
    public FetchAccountDetailsAction(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }
}
