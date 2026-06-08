package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered =
            new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size()
                < MAX_NUMBERS_ORDERED) {

            itemsOrdered.add(media);
            System.out.println(
                    "The media has been added");
        } else {
            System.out.println(
                    "The cart is almost full");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(
                    "The media has been removed");
        } else {
            System.out.println(
                    "The media does not exist");
        }
    }

    public float totalCost() {
        float total = 0;

        for (Media media : itemsOrdered) {
            total += media.getCost();
        }

        return total;
    }

    public void print() {
        System.out.println(
                "***********************CART***********************");

        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }

        System.out.println(
                "Total cost: " + totalCost());

        System.out.println(
                "***************************************************");
    }
}