import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please specify the desired length of your array");
        int desiredLength = reader.nextInt();
        int[] integerArray = new int[desiredLength];
        if (desiredLength <= 0) {
            System.out.println("Sorry, you have entered invalid parameters");
        } else if (desiredLength > 0) {
            System.out.println("Please enter an array containing " + desiredLength + " required integers");
            int numberIterator = 0;

            int i;
            for(i = 0; i < integerArray.length; ++i) {
                ++numberIterator;
                System.out.print("Enter array element No." + numberIterator + ": ");
                integerArray[i] = reader.nextInt();
            }

            System.out.println();
            System.out.println("Integers you have entered are as follows:");
            System.out.println("-------------------------------------------");

            for(i = 0; i < integerArray.length; ++i) {
                if (integerArray[i] % 2 == 0 && integerArray[i] > 10) {
                    System.out.println(integerArray[i] + " is an even number and greater than 10");
                } else if (integerArray[i] % 2 == 0 && integerArray[i] < 10) {
                    System.out.println(integerArray[i] + " is an even number and less than 10");
                } else if (integerArray[i] % 2 != 0 && integerArray[i] < 10) {
                    System.out.println(integerArray[i] + " is an odd number and less than 10");
                } else if (integerArray[i] % 2 != 0 && integerArray[i] > 10) {
                    System.out.println(integerArray[i] + " is an odd number and greater than 10");
                }
            }
        }

    }
}
