import java.util.Scanner;

/**
 * Write a description of class TextTransformer here.
 *
 * @Neel Gulati
 * @8/31/26
 */
public class TextTransformer
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to Text Transformer");
        System.out.println("=============================");
        
        System.out.print("Enter a motivational quote: ");
        String phrase = scan.nextLine();
        
        // the length method returns the # of characters in a str
        int phraseLength = phrase.length();
        System.out.println("Total characters including spaces: " + phraseLength);
        
        // the replace method returns a new version of the orignal phrase
        // replaces first char w the second char
        // og str not modified
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("Modified Phrase: " + securePhrase);
        System.out.println("Original Phrase: " + phrase);
        
        // get the first 5 characters of the str provided
        String prefix = phrase.substring(0, 5);
        System.out.println("First 5 Characters: " + prefix);
        
        // if only one paramter, returns from the first paramter inclusive to the end of the string
        String remainder = phrase.substring(5);
    }
    
}