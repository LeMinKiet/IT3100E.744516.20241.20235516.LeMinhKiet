package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc[] order = new DigitalVideoDisc[3];

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.add_DigitalVideoDisc(dvd1);
        order[0]=dvd1;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.add_DigitalVideoDisc(dvd2);
        order[1]=dvd2;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Ainmation", 18.99f);
        anOrder.add_DigitalVideoDisc(dvd3);
        order[2]=dvd3;
        System.out.println("The Cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.remove_DigitalVideoDisc(dvd3);

        System.out.println("The remain cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.display_Information(order);

}
}