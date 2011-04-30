/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.Akce;

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
     * {@link com.tieto.academy.accountbrowser.gui.swing.accountdetail.Akce.FetchAccountDetailsActions#actionPerformed(java.awt.event.ActionEvent)}
     * .
     */
    @Test
    public void testActionPerformed() {
        AccountDetailFrame frame = new AccountDetailFrame();
        frame.getTxtAccountId().setText("1");
        FetchAccountDetailsActions fetchAccountDetailsActions = new FetchAccountDetailsActions(frame, "Test");
        fetchAccountDetailsActions.actionPerformed(new ActionEvent(null, 0, "neco"));

    }

}
