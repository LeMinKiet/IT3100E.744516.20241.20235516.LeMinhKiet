package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String director, int length, String artist) {
        super(director, length);
        this.artist = artist;
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
        else System.out.println("Already in tracks");
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)) System.out.println("Track was in list");
        tracks.remove(track);
    }
    public int getLength(){
        int sum=0;
        for (Track track: tracks){
            sum+=track.getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        for (Track track: tracks){
            track.play();
        }
    }
}
