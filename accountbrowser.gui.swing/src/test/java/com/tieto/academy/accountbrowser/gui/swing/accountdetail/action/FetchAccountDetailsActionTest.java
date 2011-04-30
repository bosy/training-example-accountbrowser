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
        frame.getTxtAccountId().setText("101");
        FetchAccountDetailsAction action = new FetchAccountDetailsAction(frame, "test");
        action.actionPerformed(new ActionEvent(frame, 0, "neco"));
    }
}
