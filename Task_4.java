import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String originalWord = "";
        String reverseWord = "";
        System.out.println("Please enter desired word to check whether it is a palindrome");
        originalWord = reader.next();
        System.out.println();
        System.out.println("The word you have entered is: " + originalWord);
        int length = originalWord.length();
        System.out.print("The same word in reverse is: ");

        for(int i = length - 1; i >= 0; --i) {
            reverseWord = reverseWord + originalWord.charAt(i);
        }

        System.out.println(reverseWord);
        System.out.println();
        if (originalWord.equals(reverseWord)) {
            System.out.println("Therefore, the word you have entered IS a palindrome");
        } else {
            System.out.println("Therefore, the word you have entered IS NOT a palindrome");
        }

    }
}
