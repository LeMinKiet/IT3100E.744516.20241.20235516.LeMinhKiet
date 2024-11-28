package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media){
        if (itemsInStore.contains(media)){
            itemsInStore.add(media);
        }
        else System.out.println("Already exist!");
    }
    public void removeMedia(Media media){
        itemsInStore.remove(media);
    }
    public void displayItemsInStore(){
        System.out.println(itemsInStore.toString());
    }
}
