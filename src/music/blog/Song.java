/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.blog;

/**
 *
 * @author Hasin Sadique
 */
class Song {
    
    private int Song_ID, UID;
    private String SongName;
    
    public Song(int SID, int UserID, String SName){
        UID=UserID;
        Song_ID=SID;
        SongName=SName;
        
    }
    public int getSongID(){
        return Song_ID;
    }
    public int getUID(){
        return UID;
    }
    public String getSongName(){
        return SongName;
    }
    
}
