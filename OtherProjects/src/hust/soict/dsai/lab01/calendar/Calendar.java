package hust.soict.dsai.lab01.calendar;

import javax.swing.*;

public class Calendar {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to calendar project");
        boolean run = true;
        while (run) {
            try {
                String year = JOptionPane.showInputDialog(null, "Year is", "Take Input", JOptionPane.INFORMATION_MESSAGE);
                String month = JOptionPane.showInputDialog(null, "Month is", "Take Input", JOptionPane.INFORMATION_MESSAGE);
                String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                        "October", "November", "December"};
                String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.",
                        "Nov.", "Dec."};
                String[] monthAbbreviations2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                        "Dec"};
                int y = Integer.parseInt(year);
                int m = 0;
                int[] monthlist = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                boolean leapyear = false;
                for (int i = 0; i < monthNames.length; i++) {
                    if (month.equalsIgnoreCase(monthNames[i]) || month.equalsIgnoreCase(monthAbbreviations[i]) || month.equalsIgnoreCase(monthAbbreviations2[i]) || month.equals(String.valueOf(i + 1))) {
                        m = i + 1;
                    }
                }
                if (m > 12 || m < 1 || y < 0) {
                    JOptionPane.showMessageDialog(null, "Your month or year are not right", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Please enter right input ", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
                    if (option != JOptionPane.YES_OPTION) {
                        run = false;
                    }
                    continue;
                }
                if (y % 4 == 0) {
                    leapyear = true;
                    if (y % 100 == 0 && y % 400 != 0) {
                        leapyear = false;
                    }
                }

                if (leapyear && m == 2) {
                    JOptionPane.showMessageDialog(null, "Number of days of that month is 29", "Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Number of days of that month is" + monthlist[m - 1], "Result", JOptionPane.INFORMATION_MESSAGE);
                }
                run = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter right input ex. January is 1 in number", "Warning", JOptionPane.INFORMATION_MESSAGE);
                int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
                if (option != JOptionPane.YES_OPTION) {
                    run = false;
                }
            }
        }
    }
}
