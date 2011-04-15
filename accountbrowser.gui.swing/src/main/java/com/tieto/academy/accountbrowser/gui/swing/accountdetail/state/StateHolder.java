/**
 * StateHolder.java Apr 13, 2011 10:54:18 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * Holds and applies the current state.
 * 
 * @author Ondrej Kvasnovsky
 */
public final class StateHolder {

    /**
     * frame
     */
    private final AccountDetailFrame frame;
    /**
     * current state
     */
    private State state;

    /**
     * Creates new instance.
     * 
     * @param frame
     *            frame
     * @param state
     *            state
     */
    public StateHolder(final AccountDetailFrame frame, final State state) {
        this.frame = frame;
        this.state = state;
        this.applyState();
    }

    /**
     * Applies the current state.
     */
    private void applyState() {
        this.state.initBtnApprove(this.frame);
        this.state.initBtnFetchAccountDetails(this.frame);
        this.state.initBtnSave(this.frame);
        this.state.initLblAccountId(this.frame);
        this.state.initLblBalance(this.frame);
        this.state.initLblOwnersName(this.frame);
        this.state.initPnlAccountDetails(this.frame);
        this.state.initPnlMain(this.frame);
        this.state.initTxtAccountId(this.frame);
        this.state.initTxtBalance(this.frame);
        this.state.initTxtOwnersName(this.frame);
        this.state.initLblCurrency(this.frame);
        this.state.initTxtAccountState(this.frame);
        this.state.initLblAccountState(this.frame);
    }

    /**
     * Returns state.
     * 
     * @return the state
     */
    public State getState() {
        return this.state;
    }

    public void setState(final State state) {
        this.state = state;
        this.applyState();
    }
}
