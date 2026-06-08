package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd =
                new DigitalVideoDisc(
                        1,
                        "The Lion King",
                        "Animation",
                        "Roger Allers",
                        87,
                        19.95f);

        Book book =
                new Book(
                        2,
                        "Java Programming",
                        "Education",
                        15.5f);

        CompactDisc cd =
                new CompactDisc(
                        3,
                        "Greatest Hits",
                        "Music",
                        "Artist",
                        "Director",
                        60,
                        20.0f);

        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.print();
    }
}