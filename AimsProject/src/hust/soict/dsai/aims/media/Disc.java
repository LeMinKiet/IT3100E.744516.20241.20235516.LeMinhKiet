package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;


    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(String director, int length) {
        this.director = director;
        this.length = length;
    }


}
