package hust.soict.dsai.lab01.array;

import javax.swing.*;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Sorting Arrays");
        String num=JOptionPane.showInputDialog(null, "Enter size of arrays: ","Take Input",JOptionPane.INFORMATION_MESSAGE);
        String first = JOptionPane.showInputDialog(null, "Enter arrays (separators is \",\"). Example: 1,2,3,4: ","Take Input",JOptionPane.INFORMATION_MESSAGE);
        int[] Array = new int[Integer.parseInt(num)];
        int j=0;
        for (String i : first.split(",") ) {
            Array[j]=Integer.parseInt(i);
            j+=1;
        }
        JOptionPane.showMessageDialog(null, "Array before sorting:"+ Arrays.toString(Array));
        Arrays.sort(Array);
        JOptionPane.showMessageDialog(null, "Array after sorting:"+Arrays.toString(Array));
        int sumo =0;
        for (int k:Array) {
            sumo +=k;
        }
        double now=sumo;
        JOptionPane.showMessageDialog(null, "Sum of array :"+sumo);
        double aver = now/Array.length;
        JOptionPane.showMessageDialog(null, "Sum of array :"+aver);
    }
}
