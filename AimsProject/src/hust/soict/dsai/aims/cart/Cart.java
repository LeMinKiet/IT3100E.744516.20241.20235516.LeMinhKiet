package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered= new ArrayList<>();
    public void addMedia(Media media){
        if (itemsOrdered.size()<MAX_NUMBER_ORDERED){
            if (!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
                System.out.println("Add successfully!");
            }
            else System.out.println("Already exist!");
        }
        else System.out.println("Full!");
    }
    public void removeMedia(Media media){
        itemsOrdered.remove(media);
    }
    public float totalCost() {
        float result=0;
        for (Media media: itemsOrdered){
            result += media.cost;
        }
        return result;
    }
    public void displayInformation(){
        int max =0;
        float totalcost=0;
        for (Media media: itemsOrdered){
            if(media.toString().length()>max){
                max=media.toString().length();
            }
        }
        String[] begin = new String[max+2];
        Arrays.fill(begin,"*");
        int start=(max-2)/2;
        begin[start]="C";
        begin[start+1]="A";
        begin[start+2]="R";
        begin[start+3]="T";
        System.out.println(String.join("",begin));
        System.out.println("Ordered Items:");
        int count=0;
        for (Media media: itemsOrdered){
            totalcost+=media.cost;
            System.out.println((count+1)+"."+media.toString());
            count++;
        }
        System.out.println("Total cost: "+totalcost+"$");
        Arrays.fill(begin,"*");
        System.out.println(String.join("",begin));
    }
    public void clearCart(){
        itemsOrdered.clear();
    }
    public ArrayList<Media> Items(){
        return itemsOrdered;
    }
    public void searchDisc(int id){
        System.out.println("------Searching------");
        boolean not_found = true;
        for (Media dvd : itemsOrdered){
            if (dvd!= null && dvd.id==id){
                System.out.println(dvd.toString());
                not_found=false;
            }
        }
        if (not_found){
            System.out.println("404-Not Found");
        }
    }
    public void searchDisc(String title){
        System.out.println("------Searching------");
        boolean not_found = true;
        for (Media dvd : itemsOrdered){
            if (dvd!= null && dvd.title.equals(title)){
                System.out.println(dvd.toString());
                not_found=false;
            }
        }
        if (not_found){
            System.out.println("404-Not Found");
        }
    }
}
