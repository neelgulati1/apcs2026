import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

/**
 * Learn how to use while/for loops
 *
 * @Neel G.
 * @9/29/26
 */
public class LedgerProcessor
{
    // adding throws allows Java to handle an error
    public static void main(String[] args) throws FileNotFoundException {
        // connect scanner to an external file and the file must be in the same folder as the program
        File dataFile = new File("transactions.txt"); 
        Scanner fileScan = new Scanner(dataFile); 
        
        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        
        // counter and accumlator variables
        int count = 0;
        double totalSales = 0.0;
        
        System.out.println("=== Daily Transaction Ledger ===");
        
        // The loop will run whiler there is another line in the file
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            double price = Double.parseDouble(line); // convert a string to a double 
            
            // update our counter and accumulator
            count++;
            totalSales += price;
            
            System.out.println("Transaction #"+count+": "+ money.format(price));
        }
        
        // always close the file when done reading
        fileScan.close();
        
        double averageSales = totalSales / count;
        
        
        System.out.println("Total Items Sold: ");
        System.out.println("Total Revenue: " + money.format(totalSales));
        System.out.println("average Transaction : " + money.format(averageSales));
        
    }
}