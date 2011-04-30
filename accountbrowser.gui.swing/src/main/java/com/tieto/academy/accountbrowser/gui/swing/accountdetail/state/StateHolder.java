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

    private State state;
    private final AccountDetailFrame frame;

    /**
     * @param state
     * @param frame
     */
    public StateHolder(State state, AccountDetailFrame frame) {
        super();
        this.state = state;
        this.frame = frame;
        applyState();
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

    /**
     * @return the frame
     */
    public AccountDetailFrame getFrame() {
        return frame;
    }

    private void applyState() {
        this.state.initBtnApprove(this.frame);
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

}
