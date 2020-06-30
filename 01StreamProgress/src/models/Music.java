/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IStreamable;
/**
 *
 * @author Fajrina Aflaha
 */
public class Music implements IStreamable {
    private String artist;
    private String album;
    private int length;
    private int bytesSent;
    
    public Music(String artist, String album, int length, int bytesSent){
        this.artist = artist;
        this.album = album;
        this.length = length;
        this.bytesSent = bytesSent;
    }
    /**
     * @return the artist
     */
    public String getArtist() {
        return this.artist;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return this.album;
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
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
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
