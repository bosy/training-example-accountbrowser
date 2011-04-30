/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.action;

import java.awt.event.ActionEvent;

import org.junit.Test;

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
        frame.getTxtAccountId().setText("2");

        FetchAccountDetailsAction detailsAction = new FetchAccountDetailsAction(frame, "test");

        detailsAction.actionPerformed(new ActionEvent(frame, 0, "neco"));
    }
}
