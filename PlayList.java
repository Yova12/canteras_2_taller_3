package com.tallerSoftka3;

import java.util.ArrayList;

/**
 * 
 * @author Jairo Andres
 */
public class PlayList {
    
    private String namePlayList;
    // private ArrayList<Songs> songs = new ArrayList(); 
    public ArrayList<Songs> songsList; 

    // Contrusctor
    public PlayList(String namePlayList ) {
        this.namePlayList = namePlayList;
        this.songsList = new ArrayList(); 
    }

    // Metodos
    public void addSongPlayList(Songs song) {
        songsList.add(song); 
    }
    
    public void viewSongsPlayList() {
        for (int i = 0; i < songsList.size(); i++) {
            System.out.println(songsList.get(i));
        }
    }
    
    // Gets and Sets
    public String getNamePlayList() {
        return namePlayList;
    }

    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public ArrayList<Songs> getSongsList() {
        return songsList;
    }

    public void setSongsList(ArrayList<Songs> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String toString() {
        return "PlayList: " + namePlayList;
    }

//    @Override
//    public String toString() {
//        return "PlayList{" + "namePlayList=" + namePlayList + ", songsList=" + songsList + '}';
//    }
}
