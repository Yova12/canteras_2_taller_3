import javax.swing.JOptionPane;
/**
 * @author Jairo Andres
 */
public class SongList {
    public static String [] genders = {
        new String("Rock"),new String("Regeton"),new String("Pop")
    };

    public static String [] date = {
            new String("1991"),new String("2014"),new String("2021")
    };

    public static SongAttibute [] tracList = {
        new SongAttibute(1, "1. Enter Sadman", 4, "Rock", "1991", "Mejor Cancion"),
        new SongAttibute(2, "\n2. Patience", 3, "Rock", "1991", "Mejor Cancion"),
        new SongAttibute(3, "\n3. Sobrio", 2, "Regeton", "2021", "Mejor Cancion"),
        new SongAttibute(4, "\n4. Ambiente", 3, "Regeton", "2021", "Mejor Cancion"),
        new SongAttibute(5, "\n5. Mientes", 2, "Pop", "1991", "Mejor Cancion"),
        new SongAttibute(6, "\n6. El Perdedor", 4, "Pop", "2014", "Mejor Cancion")
    };
    static void genders(){
        int option = JOptionPane.showOptionDialog(null, "Elija el genero",
        "filtrar canciones por genero", 0, JOptionPane.QUESTION_MESSAGE, null, genders, 0);

        for (int i = 0; i < tracList.length; i++) {
            if (genders[option].equals(tracList[i].getGender())) {
                JOptionPane.showMessageDialog(null, tracList[i]);
            }
        }
    }
    static void date(){
        int option = JOptionPane.showOptionDialog(null, "Elija el año a filtrar",
        "filtrar canciones por genero", 0, JOptionPane.QUESTION_MESSAGE, null, date, 0);

        for (int i = 0; i < tracList.length; i++) {
            if (date[option].equals(tracList[i].getDate())) {
                JOptionPane.showMessageDialog(null, tracList[i]);
            }
        }
    }
    static void printsongList(){
        JOptionPane.showMessageDialog(null, SongList.tracList);
    }
}
