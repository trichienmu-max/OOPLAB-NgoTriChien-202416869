
package AimsProjectJava;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    for (DigitalVideoDisc dvd : dvdList) {
        addDigitalVideoDisc(dvd); 
    }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    addDigitalVideoDisc(dvd1);
    addDigitalVideoDisc(dvd2);
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED)
        {
            System.out.println("The cart is already full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
        if(qtyOrdered == MAX_NUMBERS_ORDERED) System.out.println("The cart is almost full");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++)
        {
            if(itemsOrdered[i] == disc)
            {
                for(int j = i + 1; j < qtyOrdered; j++)
                    itemsOrdered[j-1] = itemsOrdered[j];
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("The disc is not in the cart");
    }
    public float totalCost()
    {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++)
        {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
    }
    System.out.println("Total cost: " + totalCost() + " $");
    System.out.println("***************************************************");
    }
    public void search(int id) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].getId() == id) {
            System.out.println("Found match by ID: " + itemsOrdered[i].toString());
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("No DVD with ID " + id + " was found in the cart.");
    }
    }
    public void search(String title) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].isMatch(title)) {
            System.out.println("Found match by Title: " + itemsOrdered[i].toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No DVD with title '" + title + "' was found in the cart.");
    }
}
}
