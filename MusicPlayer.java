package com.tallerSoftka3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo Andres
 */
public class MusicPlayer {

    static Scanner scanner = new Scanner(System.in);
    private static PlayList currentList;
    public static ArrayList<PlayList> playLists = new ArrayList<>();

    // metodos
    public static void createPlayList() {

        System.out.println("Ingrese el nombre de la PlayList:");
        String namePlayList = scanner.nextLine();
        PlayList newPlayList = new PlayList(namePlayList);
        playLists.add(newPlayList);
    }

    public static void seePlayList() {

        if (playLists.isEmpty()) {
            System.out.println("Aun no hay listas de reproducción\n");
        } else {
            System.out.println("Listas de reproducción creadas\n");
            for (int i = 0; i < playLists.size(); i++) {
                System.out.println(i + ". " + playLists.get(i).getNamePlayList());
            }

            System.out.print("Seleccione la lista deseada: ");
            int iList = Integer.parseInt(scanner.nextLine());
            currentList = playLists.get(iList);
        }
        // currentList me devulve la lista creada q a sido seleccionada
        Songs songs = new Songs(); 
        songs.getSongs();
        System.out.println(currentList);
    }

    public static void addSongPlayList() {
        
    }

    // Get and Set
    public static ArrayList<PlayList> getPlayLists() {
        return playLists;
    }

    public static void setPlayLists(ArrayList<PlayList> playLists) {
        MusicPlayer.playLists = playLists;
    }
}
