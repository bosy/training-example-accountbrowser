/**
 * 
 */
package accountbrowser.domain;

/**
 * @author Student
 * 
 */
public class Account {
    private String state;
    private int id;
    private int balance;
    private Owner owner;

    /**
     * @return the state
     */

    public String getState() {
        return state;
    }

    /**
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner
     *            the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance
     *            the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getOwner().getJmeno() + " " + getBalance() + " " + getState();
    }
}
