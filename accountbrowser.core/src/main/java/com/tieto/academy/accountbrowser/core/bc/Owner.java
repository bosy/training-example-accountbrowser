/**
 * Owner.java Apr 14, 2011 7:48:15 PM
 */
package com.tieto.academy.accountbrowser.core.bc;

/**
 * Represents owner of the account.
 * 
 * @author Ondrej Kvasnovsky
 */
public class Owner {

    private String name;

    /**
     * Creates new instance.
     * 
     * @param name
     *            name
     */
    public Owner(final String name) {
        this.name = name;
    }

    /**
     * Returns name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name.
     * 
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }
}
