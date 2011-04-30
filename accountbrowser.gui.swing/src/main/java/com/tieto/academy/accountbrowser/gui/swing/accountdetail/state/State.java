/**
 * State.java Apr 13, 2011 10:04:15 PM
 */
package com.tieto.academy.accountbrowser.gui.swing.accountdetail.state;

import com.tieto.academy.accountbrowser.domain.Account;
import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * State for {@link AccountDetailFrame}.
 * 
 * @author Ondrej Kvasnovsky
 */
public interface State {

    public Account getAccount();

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initBtnApprove(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initBtnFetchAccountDetails(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initBtnSave(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initLblAccountId(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initLblAccountState(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initLblBalance(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initLblCurrency(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initLblOwnersName(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initPnlAccountDetails(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initPnlMain(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initTxtAccountId(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initTxtAccountState(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initTxtBalance(final AccountDetailFrame frame);

    /**
     * Initialize the component.
     * 
     * @param frame
     *            frame
     */
    public void initTxtOwnersName(final AccountDetailFrame frame);
}
