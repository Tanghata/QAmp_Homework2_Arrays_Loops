import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter desired number of strings in the array: ");
        int arrayLength = reader.nextInt();
        String[] enteredStrings = new String[arrayLength];
        System.out.println("Please enter " + arrayLength + " required strings");
        int numberIterator = 0;

        int i;
        for(i = 0; i < arrayLength; ++i) {
            ++numberIterator;
            System.out.print("Enter " + numberIterator + ". string: ");
            enteredStrings[i] = reader.next();
        }

        for(i = 0; i < enteredStrings.length; ++i) {
        }

        System.out.println("Elements of the array which DO NOT contain vowels are: ");

        for(i = 0; i < enteredStrings.length; ++i) {
            if (!enteredStrings[i].toLowerCase().contains("a") && !enteredStrings[i].toLowerCase().contains("e") && !enteredStrings[i].toLowerCase().contains("i") && !enteredStrings[i].toLowerCase().contains("o") && !enteredStrings[i].toLowerCase().contains("u")) {
                System.out.print(enteredStrings[i] + " ");
            }
        }

    }
}
