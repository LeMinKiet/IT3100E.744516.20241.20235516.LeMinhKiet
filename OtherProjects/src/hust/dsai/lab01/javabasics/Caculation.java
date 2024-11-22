package hust.dsai.lab01.javabasics;

import java.util.Scanner;

public class Caculation {
    public static void main(String[] args){
        String strNum1, strNum2;
        Scanner inp = new Scanner(System.in);
        strNum1 = inp.nextLine();
        strNum2 = inp.nextLine();
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double result= num1 +num2;
        System.out.println("Sum of two numbers:"+result);
        result=num1-num2;
        System.out.println("Different of two numbers:"+result);
        result=num1*num2;
        System.out.println("Product of two numbers:"+result);
        if (num2==0){
            System.out.println("Error");
        }
        else{
            result=num1/num2;
            System.out.println("Quotien of two numbers:"+result);
        }
    }

}
