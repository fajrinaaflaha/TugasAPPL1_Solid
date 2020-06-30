/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IStreamable;
/**
 *
 * @author Fajrina Aflaha
 */
public class StreamProgressInfo {
    private IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }
    
    public int calculateCurrentPercent(){
        return this.file.getBytesSent() * 100 / this.file.getLength();
    }
}
