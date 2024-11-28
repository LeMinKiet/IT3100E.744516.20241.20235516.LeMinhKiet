package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
        System.out.println("Add Successfully!");
    }
    public void removeDVD(DigitalVideoDisc dvd){
        itemsInStore.remove(dvd);
    }
    public void displayItemsInStore(){
        System.out.println(itemsInStore.toString());
    }
}
