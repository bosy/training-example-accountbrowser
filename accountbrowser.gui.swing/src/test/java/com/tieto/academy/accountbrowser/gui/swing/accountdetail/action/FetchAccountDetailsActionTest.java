/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import static org.mockito.Mockito.*;

import java.awt.event.ActionEvent;

import org.junit.Test;

import accountbrowser.dao.AccountDAO;
import accountbrowser.domain.Account;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public class FetchAccountDetailsActionTest {

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.gui.swing.accountdetail.action.FetchAccountDetailsAction#actionPerformed(java.awt.event.ActionEvent)}
     * .
     */
    @Test
    public void testActionPerformed() {
        AccountDetailFrame frame = new AccountDetailFrame();
        frame.getTxtAccountId().setText("103");

        FetchAccountDetailsAction action = new FetchAccountDetailsAction(frame, "Test");
        AccountDAO accountDAO = mock(AccountDAO.class);
        action.setAccountDAO(accountDAO);

        Account account = new Account();
        account.setId(103);
        account.setState("Approved");

        Account account2 = new Account();
        account2.setId(101);
        account2.setState("Approved");

        when(accountDAO.fetch(103)).thenReturn(account);
        when(accountDAO.fetch(101)).thenReturn(account2);

        action.actionPerformed(new ActionEvent(frame, 0, "neco"));
        frame.getTxtAccountId().setText("101");
        action.actionPerformed(new ActionEvent(frame, 0, "neco"));

        verify(accountDAO, atLeastOnce()).fetch(103);
    }

}
