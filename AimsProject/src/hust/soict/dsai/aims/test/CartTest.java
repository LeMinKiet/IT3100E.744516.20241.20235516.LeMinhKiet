package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc[] order = new DigitalVideoDisc[3];

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        order[0]=dvd1;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        order[1]=dvd2;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        order[2]=dvd3;
        System.out.println("The Cost is: ");
        System.out.println(cart.totalCost());
        cart.removeDigitalVideoDisc(dvd3);

        System.out.println("The remain cost is: ");
        System.out.println(cart.totalCost());
        cart.displayInformation(order);
        cart.searchDisc(2);
        cart.searchDisc("Aladdin");

    }

}
