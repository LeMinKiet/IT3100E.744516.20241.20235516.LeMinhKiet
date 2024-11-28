package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.Arrays;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc items_order[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int undercurrent =0; // this is qrtOrdered
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (undercurrent ==MAX_NUMBER_ORDERED) {
            System.out.println("Cart has been fulled");
        }
        else {
            items_order[undercurrent]=disc;
            undercurrent++;
            System.out.println("Disc have been added!");
            if (undercurrent >=18) {
                System.out.println("Warning: Cart is almost full");
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean Turn_on= false;
        int update= undercurrent;
        if (undercurrent ==0) {
            System.out.println("Cart is Empty");
        }
        else {
            for (int i = 0; i< undercurrent; i++) {
                if (items_order[i].equals(disc)) {
                    Turn_on=true;
                    update-=1;
                }
                if (Turn_on) {
                    if (i<19) {
                        items_order[i]=items_order[i+1];
                    }
                }
            }
            if(!Turn_on) {
                System.out.println("That Disc is not exist");
            }
            else {
                System.out.println("You have just remove disc");
            }
        }
        undercurrent =update;
    }
    public float totalCost() {
        float result=0;
        for (int i = 0; i< undercurrent; i++) {
            result+=items_order[i].getCost();
        }
        return result;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc t : dvdList){
            addDigitalVideoDisc(t);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public void displayInformation(DigitalVideoDisc[] dvdList){
        int max =0;
        float totalcost=0;
        for (int count =0; count < dvdList.length; count++){
            if(dvdList[count].toString().length()>max){
                max=dvdList[count].toString().length();
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
        for (int count =0; count < dvdList.length; count++){
            totalcost+=dvdList[count].getCost();
            System.out.println((count+1)+"."+dvdList[count].toString());
        }
        System.out.println("Total cost: "+totalcost+"$");
        Arrays.fill(begin,"*");
        System.out.println(String.join("",begin));
    }
    public void searchDisc(int id){
        System.out.println("------Searching------");
        boolean not_found = true;
        for (DigitalVideoDisc dvd : items_order){
            if (dvd!= null && dvd.getId()==id){
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
        for (DigitalVideoDisc dvd : items_order){
            if (dvd!= null && dvd.isMatch(title)){
                System.out.println(dvd.toString());
                not_found=false;
            }
        }
        if (not_found){
            System.out.println("404-Not Found");
        }
    }
}
