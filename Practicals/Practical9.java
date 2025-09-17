//Write a Java Program to Count Number of Words in Given String.
import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int wordCount = countWords(str);
        
        System.out.println("Number of words: " + wordCount);
        
        sc.close();
    }
    
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
