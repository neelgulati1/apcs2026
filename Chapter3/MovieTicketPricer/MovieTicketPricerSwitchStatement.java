
/**
 * Price movie tickets.
 *
 * @Neel G.
 * @9/21/26 (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class MovieTicketPricerSwitchStatement
{
    public static void main(String[] args) {
        // create constant var
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        final double IMAX_SURCHARGE = 5.00;
        final double IMAX_70MM_SURCHARGE = 8.00;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        
        System.out.println("---Movie Ticket Calculator---");
        System.out.println("Select Movie Format:");
        System.out.println("1 - Standard Format");
        System.out.println("2 - IMAX");
        System.out.println("3 - IMAX 70mm");
        System.out.println("Enter Choice:");
        int format = scan.nextInt();
        
        
        System.out.println("Enter the customer's age: ");
        int age = scan.nextInt();
        
        // set matinne to true if the user enters 'y'
        System.out.print("Is this a matinee showtime? (y/n) ");
        String isMatinee = scan.next();
        boolean matinee = false;
        
        switch (isMatinee.toLowerCase()) {
            case "y": 
                matinee = true;
                break;
            case "n":
                matinee = false;
                break;
            }
        // set pass to true if the user enters 'y'
        System.out.print("Does the customer have a pass? (y/n) ");
        String hasPass = scan.next();
        boolean pass = hasPass.toLowerCase().equals("y");
        
        double ticketPrice;
        
        switch (format) {
            case 1:
                if (age < 13 || age >= 65 || (matinee && pass)) {
                ticketPrice = DISCOUNT_PRICE;
                System.out.println("Status: Discount Applied!");
                break;
            }
            else {
                ticketPrice = REGULAR_PRICE;
                System.out.println("Status: Regular Rate Applied.");
                break;
            }
            
            case 2:
                ticketPrice = REGULAR_PRICE  + IMAX_SURCHARGE;
                System.out.println("Status: IMAX Surcharge Applied");
                break;
            
            case 3:
                ticketPrice = IMAX_70MM_SURCHARGE;
                System.out.println("Status: IMAX 70mm Surcharge Applied");
                break;
                
            default: 
                ticketPrice = REGULAR_PRICE;
                System.out.println("Status: Incorrect entry. Regular Price Applied.");
                break;
        }
        
        System.out.println("Total Due: " + money.format(ticketPrice));
    }
}