package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Arrays;

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
