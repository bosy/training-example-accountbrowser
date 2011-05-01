/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import accountbrowser.dao.DAOFactory;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.ApprovedState;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SavedState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

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
        String text = getFrame().getTxtAccountId().getText();
        /*
         * if ("".equals(text)) { JOptionPane.showMessageDialog(getFrame(),
         * "Fill in id field"); return; }
         */
        Integer id = Integer.valueOf(text);
        Account account = daoFactory.getAccountDAO().fetch(id);

        if (account != null) {
            if ("Approved".equals(account.getState())) {
                getFrame().setState(new ApprovedState(account));
            } else if ("Saved".equals(account.getState())) {
                getFrame().setState(new SavedState(account));
            }
            getFrame().getTxtOwnersName().setText(account.getOwner().getName());
            getFrame().getTxtAccountState().setText(account.getState());
            getFrame().getTxtBalance().setText(new Integer(account.getBalance()).toString());

        }

    }

    /**
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);

    }

}
