/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IRechargeable;

/**
 *
 * @author Fajrina Aflaha
 */
public class Robot extends Worker implements IRechargeable{
    private int capacity;
    private int currentPower;
    
    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return the currentPower
     */
    public int getCurrentPower() {
        return currentPower;
    }

    /**
     * @param currentPower the currentPower to set
     */
    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }
    
    @Override
    public void work(int hours){
        if(hours > this.currentPower)
            hours = currentPower;
        
        super.work(hours);
        this.currentPower -= hours;
    }
    
    @Override
    public void recharge() {
        this.currentPower = this.capacity;
    }
}
