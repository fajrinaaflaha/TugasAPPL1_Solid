/*
 * Created By Fajrina Aflaha.
 */
package application;

/**
 *
 * @author Fajrina Aflaha
 */
public class Employee {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the name
     */
    @Override
    public String toString(){
        return this.name;
    }
    
}
