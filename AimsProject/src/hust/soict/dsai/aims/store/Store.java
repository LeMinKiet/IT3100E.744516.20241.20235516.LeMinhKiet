package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media){
        if (!itemsInStore.contains(media)){
            itemsInStore.add(media);
            System.out.println("Add successfully!");
        }
        else System.out.println("Already exist!");
    }
    public void removeMedia(Media media){
        itemsInStore.remove(media);
    }
    public void displayItemsInStore(){
        for (Media media : itemsInStore){
            System.out.println("+)"+media.toString());
        }
    }
    public Media searchMedia(String title){
        Media found= new Media();
        found.title="Wrong!";
        for (Media media: itemsInStore){
            if (media.title.equals(title)){
                return media;
            }
        }
        return found;
    }
    public ArrayList<Media> Items(){
        return  itemsInStore;
    }

}
