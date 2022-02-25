/**
 * @author Jairo Andres
 */
public class SongAttibute {
    
    private int id; 
    private String tittle; 
    private float duration; 
    private String gender; 
    private String date;
    private String description;

    public SongAttibute(int id, String tittle, float duration,
        String gender, String date, String description) {
        this.id = id;
        this.tittle = tittle;
        this.duration = duration;
        this.gender = gender;
        this.date = date;
        this.description = description;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public float getDuration() {
        return duration; 
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return tittle + ": Genero " + gender + ", Duracion " + duration + ", Fecha "+
            date + ", Identificador " + id + ", Descripcion " + description;
        
    }

       
  
}
