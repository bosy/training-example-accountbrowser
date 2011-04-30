/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import accountbrowser.dao.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.EmptyState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsActions extends AccountDetailAbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = -7081683576635902598L;

    /**
     * @param name
     */
    public FetchAccountDetailsActions(AccountDetailFrame frame, String name) {
        super(frame, name);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String id = getFrame().getTxtAccountId().getText();
        DAOFactory daoFactory = DAOFactory.getInstance();
        Account account = daoFactory.getAccountDAO().fetch(Integer.valueOf(id));

        if (null != account) {
            String state = account.getState();
            if ("Approved".equals(state)) {
                getFrame().setState(new ApprovedState(account));
            } else if ("Saved".equals(state)) {
                getFrame().setState(new SavedState(account));
            } else {
                getFrame().setState(new EmptyState());
            }
        } else {
            JOptionPane.showMessageDialog(getFrame(), "Uzivatel s id " + id + " nebyl nalezen");
            getFrame().setState(new EmptyState());
        }

    }

}
