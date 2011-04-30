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
public class FetchAccountDetailsActionsTest {

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.gui.swing.accountdetail.action.FetchAccountDetailsActions#actionPerformed(java.awt.event.ActionEvent)}
     * .
     */
    @Test
    public void testActionPerformed() {
        AccountDetailFrame frame = new AccountDetailFrame();
        frame.getTxtAccountId().setText("0");
        FetchAccountDetailsActions action = new FetchAccountDetailsActions(frame, "Test");
        action.actionPerformed(new ActionEvent(frame, 0, "neco"));
    }

}
