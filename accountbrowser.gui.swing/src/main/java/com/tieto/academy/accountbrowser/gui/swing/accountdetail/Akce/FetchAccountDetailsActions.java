/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.Akce;

import java.awt.event.ActionEvent;

import accountbrowser.dao.abi002.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsActions extends AccountDetailAbstractAction {

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
        DAOFactory daoFactory = DAOFactory.getInstance();
        String id = getFrame().getTxtAccountId().getText();
        Account account = daoFactory.getAccountDAO().fetch(Integer.parseInt(id));
        if (account != null) {
            if ("Approved".equals(account.getState())) {
                getFrame().setState(new ApprovedState(account));
            } else if ("Saved".equals(account.getState())) {
                getFrame().setState(new SavedState(account));
            }
        }

    }

    /**
     * @param frame
     * @param name
     */
    public FetchAccountDetailsActions(AccountDetailFrame frame, String name) {
        super(frame, name);

    }

}
