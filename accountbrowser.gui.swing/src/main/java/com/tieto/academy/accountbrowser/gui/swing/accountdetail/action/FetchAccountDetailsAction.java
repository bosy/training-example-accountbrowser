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
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.state.SaveState;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsAction extends AccountDetailAbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = -4210021844671583245L;

    /*
     * (non-Javadoc)
     * 
     * @see
     * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String text = getFrame().getTxtAccountId().getText();
        if ("".equals(text)) {
            JOptionPane.showMessageDialog(getFrame(), "fill in the field");
            return;
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        Integer id = Integer.valueOf(text);
        Account account = daoFactory.getAccountDAO().fetch(id);

        if (account != null) {
            if ("Approved".equals(account.getState())) {
                getFrame().setState(new ApprovedState(account));
            } else if ("Saved".equals(account.getState())) {
                getFrame().setState(new SaveState(account));
            }
            getFrame().getTxtAccountState().setText(account.getState());
            getFrame().getTxtOwnersName().setText(account.getOwner().getName());
            getFrame().getTxtBalance().setText(new Integer(account.getBalance()).toString());
        }

    }

    /**
     * @param name
     */
    public FetchAccountDetailsAction(AccountDetailFrame frame, String name) {
        super(frame, name);
        // TODO Auto-generated constructor stub
    }

}
