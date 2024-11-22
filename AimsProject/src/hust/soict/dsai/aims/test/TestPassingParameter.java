package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDisc[] swapped = swap(jungleDVD, cinderellaDVD);
        jungleDVD=swapped[0];
        cinderellaDVD=swapped[1];
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());
    }
    //This is swap right;
    public static DigitalVideoDisc[] swap(DigitalVideoDisc o1, DigitalVideoDisc o2){
        DigitalVideoDisc[] swap =new DigitalVideoDisc[2];
        swap[0]=o2;
        swap[1]=o1;
        return swap;

    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd= new DigitalVideoDisc(oldTitle);
    }
}
