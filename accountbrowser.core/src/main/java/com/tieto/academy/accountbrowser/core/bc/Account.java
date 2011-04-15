/**
 * Account.java Apr 14, 2011 7:48:00 PM
 */
package com.tieto.academy.accountbrowser.core.bc;

/**
 * Holds values related to the account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Account {

    public static final String APPROVED = "Approved";
    public static final String SAVED = "Saved";
    private final int accountNumber;
    private int balance;
    private String currency;
    private Owner owner;
    private String state;

    /**
     * Creates new instance.
     * 
     * @param owner
     *            owner
     * @param accountNumber
     *            account number
     */
    public Account(final Owner owner, final int accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    /**
     * Returns accountNumber.
     * 
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Returns balance.
     * 
     * @return the balance
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Returns currency.
     * 
     * @return the currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Returns owner.
     * 
     * @return the owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * Returns state.
     * 
     * @return the state
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the balance.
     * 
     * @param balance
     *            the balance to set
     */
    public void setBalance(final int balance) {
        this.balance = balance;
    }

    /**
     * Set the currency.
     * 
     * @param currency
     *            the currency to set
     */
    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    /**
     * Set the owner.
     * 
     * @param owner
     *            the owner to set
     */
    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    /**
     * Set the state.
     * 
     * @param state
     *            the state to set
     */
    public void setState(final String state) {
        this.state = state;
    }
}
