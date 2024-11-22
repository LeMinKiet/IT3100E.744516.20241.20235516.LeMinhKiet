package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc items_order[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int undercurrent =0; // this is qrtOrdered
    public void add_DigitalVideoDisc(DigitalVideoDisc disc) {
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
    public void remove_DigitalVideoDisc(DigitalVideoDisc disc) {
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
    public void add_DigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc t : dvdList){
            add_DigitalVideoDisc(t);
        }
    }
    public void add_DigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        add_DigitalVideoDisc(dvd1);
        add_DigitalVideoDisc(dvd2);
    }
}
