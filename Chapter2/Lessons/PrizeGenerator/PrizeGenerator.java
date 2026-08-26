

/**
 * Write a description of class PrizeGenerator here.
 *
 * Neel Gulati
 * Date Modified
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class PrizeGenerator
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to the APCSA Prize Simulator");
        System.out.println("--------------------");
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        
        
        System.out.print("How much money do you have? $");
        double startBalance = scan.nextDouble();
        
        // Generate a random cash prize from $10 - $100
        int prizeAmount = 10 + (int) (Math.random() * 91);
        
        // Generate a random fee between $1 and $5
        int fee = 1 + (int) (Math.random() * 5); 
        
        
    }
}
