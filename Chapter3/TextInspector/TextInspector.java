import java.util.Scanner;

/**
 * Write a description of class TextInspector here.
 *
 * @Neel G.
 * @10/5/26                  */
public class TextInspector
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("=== Text Inspector ===");
        System.out.println("Please enter a word or phrase: ");
        String text = scan.nextLine();
        
        // determine the length of word/phrase
        System.out.println("Total Length: " + text.length());
        
        // count the vowels i the word/phrase
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = 0; i < text.length(); i++) {
            // extract a single character using substring
            String ch = text.substring(i, i+1);
            
            // the indexOf method checks if a string is within another string
            if (vowels.indexOf(ch.toLowerCase())!= -1) {
                count++;
            }
        }
        System.out.println("Vowel Count: " + count);
        
        // search our word/phrase for a given word/phrase
        System.out.print("Enter a search term: ");
        String searchTerm = scan.nextLine();
        int foundIndex = text.indexOf(searchTerm);
        if (foundIndex != -1) {
            // extract from found index to the end of the string
            String remainingText = text.substring(foundIndex);
            System.out.println("Substring from match to end: " + remainingText);
        }
        
        System.out.println("Please enter a second word/phrase to compare: ");
        String secondWord = scan.nextLine();
        
        // test if the strings are equal
        if (text.equals(secondWord)) {
            System.out.println("The two words/phrases are equal.");
        }
        else {
            // text alphbetical ordering using compareTo
            int cmp = text.compareTo(secondWord);
            if (cmp < 0) {
                System.out.println(text + " comes BEFORE " + secondWord);
            }
            else if (cmp > 0) {
                System.out.println(text + " comes AFTER " + secondWord);
            }
            else {
                System.out.println(text + " are equal " + secondWord);
            }
        }
    }
}