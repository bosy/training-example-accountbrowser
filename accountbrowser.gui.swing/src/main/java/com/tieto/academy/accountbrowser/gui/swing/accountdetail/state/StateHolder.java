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
        applyState();
    }

    private void applyState() {
        this.state.initBtnApprove(this.frame);
        this.state.initBtnFetchAccountDetails(this.frame);
        this.state.initBtnSave(this.frame);
        this.state.initLblAccountId(this.frame);
        this.state.initLblAccountState(this.frame);
        this.state.initLblBalance(this.frame);
        this.state.initLblCurrency(this.frame);
        this.state.initLblOwnersName(this.frame);
        this.state.initPnlAccountDetails(this.frame);
        this.state.initPnlMain(this.frame);
        this.state.initTxtAccountId(this.frame);
        this.state.initTxtAccountState(this.frame);
        this.state.initTxtBalance(this.frame);
        this.state.initTxtOwnersName(this.frame);
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
        applyState();
    }
}
