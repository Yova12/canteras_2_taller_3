package com.tallerSoftka3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo Andres
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        
        int option = 1;

        do {
            System.out.println("--- REPRODUCTOR DE MUSICA ---");
            System.out.println("1. Crear Lista de reproducción\n"
                    + "2. Ver y Seleccionar Listas de reproducción\n"
                    + "0. Salir\n");
            System.out.print("Seleccion una Opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    MusicPlayer.createPlayList(); 
                    break;
                case 2:
                    MusicPlayer.seePlayList();
                    break;
                case 0:
                    System.out.println("Buen día");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida\n");
                    break;
            }

        } while (option != 0);
    }
    
    public static void menuPlaylist() {
        int option = 1; 
        do {            
            System.out.println("1. Agregar canción a la playList\n"
                             + "2. Ver las canciónes agregadas\n"
                             + "0. Regresar\n");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt(); 
            
            switch (option) {
                case 1: 
                    break; 
                case 2:
                    break; 
                case 0: 
                    menu(); 
                    break; 
            }
        } while (option != 0);
    }
}
