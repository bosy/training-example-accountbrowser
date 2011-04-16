/**
 * 
 */
package accountBrowser.domain;

/**
 * @author Student
 * 
 */
public class Account {

    private int _id;

    private int _balance;

    private String _state;

    private Owner _owner;

    /**
     * @return the _owner
     */
    public Owner get_owner() {
        return _owner;
    }

    /**
     * @param _owner
     *            the _owner to set
     */
    public void set_owner(Owner _owner) {
        this._owner = _owner;
    }

    /**
     * @return the _id
     */
    public int get_id() {
        return _id;
    }

    /**
     * @param _id
     *            the _id to set
     */
    public void set_id(int _id) {
        this._id = _id;
    }

    /**
     * @return the _balance
     */
    public int get_balance() {
        return _balance;
    }

    /**
     * @param _balance
     *            the _balance to set
     */
    public void set_balance(int _balance) {
        this._balance = _balance;
    }

    /**
     * @return the _state
     */
    public String get_state() {
        return _state;
    }

    /**
     * @param _state
     *            the _state to set
     */
    public void set_state(String _state) {
        this._state = _state;
    }

}
