/**
 * 
 */
package com.tieto.academy.accountbrowser.core.bc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test for {@link Account }class.
 * 
 * @author Ondrej Kvasnovsky
 */
public class AccountTest {

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#Account(com.tieto.academy.accountbrowser.core.bc.Owner, int)}
     * .
     */
    @Test
    public final void testAccount() {
        // "Missing Assertions" - TODO has to generate "fail"
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getAccountNumber()}
     * .
     */
    @Test
    public final void testGetAccountNumber() {
        // Bad example of "Multiple Assertions"
        Account account1 = new Account(null, -1);
        assertEquals(-1, account1.getAccountNumber());
        Account account2 = new Account(null, 0);
        assertEquals(0, account2.getAccountNumber());
        Account account3 = new Account(null, 1);
        assertEquals(1, account3.getAccountNumber());
        Account account4 = new Account(null, 1000000000);
        assertEquals(1000000000, account4.getAccountNumber());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getAccountNumber()}
     * .
     */
    @Test
    public final void testGetAccountNumberNegativeValue() {
        // Correct way!
        Account account = new Account(null, -1);
        assertEquals(-1, account.getAccountNumber());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getAccountNumber()}
     * .
     */
    @Test
    public final void testGetAccountNumberPositiveValue() {
        // Correct way!
        Account account = new Account(null, 1);
        assertEquals(1, account.getAccountNumber());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getAccountNumber()}
     * .
     */
    @Test
    public final void testGetAccountNumberZero() {
        // Correct way!
        Account account = new Account(null, 0);
        assertEquals(0, account.getAccountNumber());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getBalance()}.
     */
    @Test
    public final void testGetBalance() {
        // Bad example of "Using the Wrong Assert"
        Account account = new Account(null, 0);
        account.setBalance(100);
        assertTrue(account.getBalance() == 100);
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getCurrency()}.
     */
    @Test
    public final void testGetCurrency() {
        // Correct way!
        Account account = new Account(null, 0);
        account.setBalance(100);
        int balance = account.getBalance();
        assertEquals(100, balance);
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getOwner()}.
     */
    @Test
    public final void testGetOwner() {
        // Bad example of "Overly Complex Tests".
        String ownerName = "King Charles";
        Owner owner = new Owner(ownerName);
        assertNotNull(owner);
        int accountNumber = 156051065;
        Account account = new Account(owner, accountNumber);
        assertNotNull(account);
        account.setState(Account.APPROVED);
        String state = account.getState();
        assertNotNull(state);
        assertEquals(Account.APPROVED, state);
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#getState()}.
     */
    @Test
    public final void testGetState() {
        // Correct way!
        Account account = new Account(null, 0);
        account.setState(Account.APPROVED);
        String state = account.getState();
        assertEquals(Account.APPROVED, state);
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#setBalance(int)}.
     */
    @Test
    public final void testSetBalanceNull() {
        // Example of "Catching Unexpected Exceptions".
        try {
            Account account = new Account(null, 0);
            account.setState(null);
            assertEquals(null, account.getState());
        } catch (NullPointerException ex) {
            fail("Something is null!!!!");
        }
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#setCurrency(java.lang.String)}
     * .
     */
    @Test(expected = NullPointerException.class)
    public final void testSetCurrency() {
        // Correct way!
        Account account = new Account(null, 0);
        account.setState(null);
        assertEquals(0, account.getState().length());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#setOwner(com.tieto.academy.accountbrowser.core.bc.Owner)}
     * .
     */
    @Test
    public final void testSetOwnerNull() {
        Account account = new Account(null, 0);
        account.setOwner(null);
        assertNull(account.getOwner());
    }

    /**
     * Test method for
     * {@link com.tieto.academy.accountbrowser.core.bc.Account#setState(java.lang.String)}
     * .
     */
    @Test
    public final void testSetStateNull() {
        Account account = new Account(null, 0);
        account.setState(null);
        assertNull(account.getState());
    }
}
