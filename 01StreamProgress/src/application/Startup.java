/*
 * Created By Fajrina Aflaha.
 */
package application;

import models.*;
import interfaces.*;
/**
 *
 * @author Fajrina Aflaha
 */
public class Startup {
    public static void main(String[] args){
        File file = new File("Test", 12, 12);
        Music music = new Music("Annyeong", "Cool", 15, 2222);

        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(streamFileInfo.calculateCurrentPercent());
        System.out.println(streamMusicInfo.calculateCurrentPercent());
    }
}
