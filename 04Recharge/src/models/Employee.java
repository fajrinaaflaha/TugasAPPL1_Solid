/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.ISleeper;

/**
 *
 * @author Fajrina Aflaha
 */
public class Employee extends Worker implements ISleeper{
    public Employee(String id){
        super(id);
    }
    
    @Override
    public void sleep() {
        //sleep
    }
    
}
