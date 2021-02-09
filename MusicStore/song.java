

public class Song {

    private String title, artist, genre;
    private double duration, price;

    Song() {
        title = "Blinding Lights";
        artist = "The Weeknd";
        genre = "R&B";
        duration = 202;
        price = 1.29;
    }

    Song(String t, String a, String g, int d, int p) {
        title = t;
        artist = a;
        genre = g;
        duration = d;
        price = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String a){
        artist = a;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String g){
        genre = g;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int d) {
        duration = d;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String toString() {

    }
}