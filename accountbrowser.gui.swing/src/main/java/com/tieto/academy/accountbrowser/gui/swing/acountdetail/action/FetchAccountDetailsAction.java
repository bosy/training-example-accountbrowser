/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.acountdetail.action;

import java.awt.event.ActionEvent;

import com.tieto.academy.accountbrowser.DAO.DAOFactory;
import com.tieto.academy.accountbrowser.domain.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    /**
     * @param name
     * @param frame
     */
    public FetchAccountDetailsAction(String name, AccountDetailFrame frame) {
        super(name, frame);
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
}
