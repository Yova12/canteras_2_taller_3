import javax.swing.JOptionPane;
/** 
 * [ Esta clase es la encargada de filtrar la canciones por genero o año 
 * 
 * @version 1.00.000 2022-02-24
 * 
 * @author Yovanny Arley valderrama - Valderrama1858@gmail.com
 * 
 * @since 1.00.000 2022-02-24
 * 
 **/ 

public class FilterSongs {
    static void filterSongs(){
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "Filtrar canciones\n1. Filtrar por generon\n2. filtrar por fecha"));
            if (option == 1) {
                SongList.genders();
            } 
            else{
                if (option == 2){
                    SongList.date();
                }
            }
    }
}
