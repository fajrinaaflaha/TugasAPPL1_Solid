/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IStreamable;

/**
 *
 * @author Fajrina Aflaha
 */
public class File implements IStreamable {
    private String name;
    private int length;
    private int bytesSent;
    
    public File(String name, int length, int bytesSent){
        this.name = name;
        this.length = length;
        this.bytesSent = bytesSent;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the length
     */
    @Override
    public int getLength() {
        return this.length;
    }
    
    /**
     * @return the bytesSent
     */
    @Override
    public int getBytesSent() {
        return this.bytesSent;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @param bytesSent the bytesSent to set
     */
    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }
}
