package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc
        implements Playable {

    private String artist;
    private ArrayList<Track> tracks
            = new ArrayList<Track>();

    public CompactDisc(int id, String title,
                       String category,
                       String artist,
                       String director,
                       int length,
                       float cost) {

        super(id, title, category,
                director, length, cost);

        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed");
        }
    }

    public int getLength() {
        int totalLength = 0;

        for (Track track : tracks) {
            totalLength += track.getLength();
        }

        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: "
                + getTitle());

        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CD - " + getTitle()
                + " - " + getCategory()
                + " - " + artist
                + ": " + getCost() + "$";
    }
}