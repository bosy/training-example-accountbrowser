/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountbrowser.DAO.AccountDAO;
import accountbrowser.DAO.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailAction extends AccountDetailAbstractAction {

    /**
     * @param name
     * @param f
     */
    public FetchAccountDetailAction(String name, AccountDetailFrame f) {
        super(name, f);
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
        AccountDAO accountDAO = DAOFactory.getInstance().getAccountDAO();
        String strID = this.getFrame().getTxtAccountId().getText();
        Integer id = Integer.valueOf(strID);
        Account account = accountDAO.Fetch(id);

        if (account != null) {
            if ("approved".equals(account.getState())) {
                getFrame().setState(new ApprovedState(account));
            } else if ("saved".equals(account.getState())) {
                getFrame().setState(new SavedState(account));
            }
        }
    }
}
