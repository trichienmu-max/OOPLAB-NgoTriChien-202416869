package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(int id, String title,
                            String category, String director,
                            int length, float cost) {

        super(id, title, category, director, length, cost);
    }

    @Override
public void play() throws hust.soict.dsai.aims.exception.PlayerException {
    if (this.getLength() <= 0) {
        throw new hust.soict.dsai.aims.exception.PlayerException(
                "ERROR: DVD length is non-positive!");
    }

    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
}

    @Override
    public String toString() {
        return "DVD - " + getTitle()
                + " - " + getCategory()
                + " - " + getDirector()
                + " - " + getLength()
                + ": " + getCost() + "$";
    }
}