package com.tallerSoftka3;

import java.util.ArrayList;

/**
 *
 * @author Jairo Andres
 */
public class Songs {
    
    /**
     *  Creamos un arreglo de tipo SongAttribute que contiene cada una de las canciónes
     */
    public static ArrayList<SongAttibute> songs = new ArrayList(); 
        
    public void getSongs() {
        
        SongAttibute song1 = new SongAttibute(1, "Enter Sadman", 4, "Rock", "1991", "Mejor Cancion"); 
        SongAttibute song2 = new SongAttibute(2, "Patience", 3, "Rock", "1988", "Mejor Cancion"); 
        SongAttibute song3 = new SongAttibute(3, "Sobrio", 2, "Regeton", "2021", "Mejor Cancion"); 
        SongAttibute song4 = new SongAttibute(4, "Ambiente", 3, "Regeton", "2018", "Mejor Cancion"); 
        SongAttibute song5 = new SongAttibute(5, "Mientes", 2, "Pop", "2010", "Mejor Cancion"); 
        SongAttibute song6 = new SongAttibute(6, "El Perdedor", 4, "Pop", "2014", "Mejor Cancion"); 
        
        songs.add(song1); 
        songs.add(song2); 
        songs.add(song3); 
        songs.add(song4); 
        songs.add(song5); 
        songs.add(song6); 
        
        /**
         * Se itera sobre la lista de arreglo y devolvemos el nombre de cada canción
         */
        for(int i = 0; i < songs.size(); i++) {
            System.out.println(i + ". " + songs.get(i).getTittle() );
        }
    } 

    @Override
    public String toString() {
        return "Songs{" + "songs=" + songs + '}';
    }
    
    
    
}


