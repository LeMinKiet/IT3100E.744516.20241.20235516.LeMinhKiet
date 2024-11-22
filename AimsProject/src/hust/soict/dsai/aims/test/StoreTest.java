package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args ){
        Store mystore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        mystore.addDVD(dvd1);
        mystore.addDVD(dvd2);
        mystore.addDVD(dvd3);
        mystore.displayItemsInStore();
        mystore.removeDVD(dvd1);
        mystore.displayItemsInStore();
    }
}
