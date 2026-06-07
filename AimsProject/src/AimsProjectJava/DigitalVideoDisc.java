package AimsProjectJava;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id=nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public void setTitle(String title) {
    this.title = title;
    }
    public boolean isMatch(String title) {
    return this.title.equalsIgnoreCase(title);
    }
    public String toString() {
    return "DVD - " + title + " - " + (category != null ? category : "N/A") + 
           " - " + (director != null ? director : "N/A") + 
           " - " + length + ": " + cost + " $";
    }
}
