package hust.soict.dsai.lab01.javabasics;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: "+ (option == JOptionPane.YES_OPTION? "Yes":"No"));
        System.exit(0);

    }

}
