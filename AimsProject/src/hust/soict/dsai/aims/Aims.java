package hust.soict.dsai.aims;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc(
                1,
                "The Lion King",
                "Animation",
                "Roger Allers",
                87,
                19.95f);

        cart.addMedia(dvd);

        Book book = new Book(
                2,
                "Java Programming",
                "Education",
                15.5f);

        cart.addMedia(book);

        CompactDisc cd = new CompactDisc(
            3,
            "Greatest Hits",
            "Music",
            "Unknown Director",
            "Artist",
            45,
            20.0f);

        Track track1 = new Track("Track 1", 5);
        Track track2 = new Track("Track 2", 7);

        cd.addTrack(track1);
        cd.addTrack(track2);

        cart.addMedia(cd);

        System.out.println(cart);

        try {
            dvd.play();
            cd.play();
        } catch (PlayerException e) {
            System.out.println(e.getMessage());
        }
    }
}