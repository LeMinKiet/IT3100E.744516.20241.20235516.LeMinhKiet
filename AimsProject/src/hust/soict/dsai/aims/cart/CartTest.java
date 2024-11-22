package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc[] order = new DigitalVideoDisc[3];

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.add_DigitalVideoDisc(dvd1);
        order[0]=dvd1;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.add_DigitalVideoDisc(dvd2);
        order[1]=dvd2;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Ainmation", 18.99f);
        cart.add_DigitalVideoDisc(dvd3);
        order[2]=dvd3;
        System.out.println("The Cost is: ");
        System.out.println(cart.totalCost());
        cart.remove_DigitalVideoDisc(dvd3);

        System.out.println("The remain cost is: ");
        System.out.println(cart.totalCost());
        cart.display_Information(order);

    }

}
