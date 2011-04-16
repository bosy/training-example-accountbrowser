/**
 * 
 */
package accountbrowser.domain;

/**
 * @author Student
 * 
 */
public class Owner {
    private String jmeno;

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno
     *            the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return jmeno;
    }
}
