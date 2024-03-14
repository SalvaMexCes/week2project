package project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int feeA = 2;
        int feeB = 5;
        int feeC = 10;
        int feeD = 15;
        int feeE = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of product are you buying?");
        String userProduct = scanner.next();
        System.out.println("What is the price?");
        int price = scanner.nextInt();
        System.out.println("What is the quantity?");
        int qty = scanner.nextInt();
        System.out.println("For this delivery, what is the distance (in miles)?");
        int miles = scanner.nextInt();

        if (miles >= 0 && miles <= 4){
            System.out.println("Your total is $" + (price*qty+feeA));
        } else if ( miles > 4 && miles <= 15 ) {
            System.out.println("Your total is $" +(price*qty+feeB));
        } else if (miles >15 && miles <= 25) {
            System.out.println("Your total is $" + (price*qty+feeC));
        } else if (miles >25 && miles <= 50) {
            System.out.println("Your total is $" + (price*qty+feeD));
        } else
            System.out.println("Your total is $" + (price*qty+feeE) );

    }
}
