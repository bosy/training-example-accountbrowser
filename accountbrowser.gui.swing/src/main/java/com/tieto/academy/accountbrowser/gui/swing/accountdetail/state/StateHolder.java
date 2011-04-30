/**
 * 
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * @author Student
 * 
 */
public final class StateHolder {

    private final AccountDetailFrame frame;
    private State state;

    /**
     * @param state
     * @param frame
     */
    public StateHolder(State state, AccountDetailFrame frame) {
        this.state = state;
        this.frame = frame;
        this.applyState();
    }

    private void applyState() {
        this.state.initBtnApprove(frame);
        this.state.initBtnFetchAccountDetails(frame);
        this.state.initBtnSave(frame);
        this.state.initLblAccountId(frame);
        this.state.initLblAccountState(frame);
        this.state.initLblBalance(frame);
        this.state.initLblCurrency(frame);
        this.state.initLblOwnersName(frame);
        this.state.initPnlAccountDetails(frame);
        this.state.initPnlMain(frame);
        this.state.initTxtAccountId(frame);
        this.state.initTxtAccountState(frame);
        this.state.initTxtBalance(frame);
        this.state.initTxtOwnersName(frame);
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(State state) {
        this.state = state;
        this.applyState();
    }
}
