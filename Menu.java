import javax.swing.JOptionPane;
/**
 * @author Yovanny Arley Valderrama Figueroa
 */

public class Menu {
    static void menu(){
        int option = 0;
        option = Integer.parseInt(JOptionPane.showInputDialog("Menu.\n"+
            "1. Ver lista de reproduccion.\n2. Crear Playlist\n"+
            "3. Playlist creada\n4. Filtrar canciones\n5. Salir"));

            do {
                switch (option) {
                    case 1:
                        SongList.printsongList(); 
                        menu();
                        break;
                    case 2:
                        Playlist.playlist();
                        menu();
                        break;
                    case 3:
                        Playlist.printNewplaylist();
                        menu();
                        break;
                    case 4:
                        FilterSongs.filterSongs();;
                        menu();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                        default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                        menu();
                        break;
                }
            } while (option != 5);
    }
}
    
