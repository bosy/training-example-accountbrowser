/**
 * 
 */
package com.tieto.academy.accountbrowser.domain;

/**
 * @author Student
 * 
 */
public class Owner {

    private String name;

    /**
     * @param name
     */
    public Owner(String name) {
        super();
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
