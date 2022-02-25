
import javax.swing.JOptionPane;
/**
 * @author Yovanny Arley Valderrama Figueroa
 */
public class Playlist {
    public static String [] newPlaylist;
    public static String playlistName;
    
    static void playlist(){
        String song;
        int playlistzise;
        playlistName = JOptionPane.showInputDialog("Nombre de la Playlist");
        playlistzise = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas canciones deseas ingresar?"));
        
        newPlaylist = new String[playlistzise];
        for ( int i = 0; i < newPlaylist.length; i++) { song = (JOptionPane.showInputDialog(null,
            "Seleccione la cancion que desea agregar a la Playlist", "Playlist",JOptionPane.PLAIN_MESSAGE,
            null, SongList.tracList, "selelcciona")).toString();newPlaylist[i] = song;
        }
    }

    static void printNewplaylist(){
            JOptionPane.showMessageDialog(null, newPlaylist, "Playlist ====> " + playlistName, 1);
    }

}