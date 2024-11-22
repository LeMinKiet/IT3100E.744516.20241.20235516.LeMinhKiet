package hust.soict.dsai.lab01.triagle;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingfromStar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] character = new String[2 * n + 1];
        Arrays.fill(character, " ");
        character[n] = "*";
        for (int i = 1; i < n + 1; i++) {
            System.out.println(String.join("", character));
            character[n - i] = "*";
            character[n + i] = "*";
        }
        inp.close();
    }
}