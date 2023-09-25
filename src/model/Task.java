package model;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task {
    

    private String title;

    private String description;

    private Calendar date;

    
    
    public Task(String title, String description, Calendar date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String fechaString(Calendar fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDate: " + fechaString(this.date);
    }

    

}