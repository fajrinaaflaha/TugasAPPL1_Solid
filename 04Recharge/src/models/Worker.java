/*
 * Created By Fajrina Aflaha.
 */
package models;

/**
 *
 * @author Fajrina Aflaha
 */
public abstract class Worker {
    private String id;
    private int workingHours;
    
    public Worker(String id){
        this.id = id;
    }
    
    public void work(int hours){
        this.workingHours += hours;
    }
}
