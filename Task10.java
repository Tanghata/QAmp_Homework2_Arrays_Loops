import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the lowest number in the range (must be >0): ");
        int startingNum = reader.nextInt();
        while (startingNum < 1) {
            System.out.print("You have entered incorrect parameter(s). Please try again: ");
            startingNum = reader.nextInt();
        }

        System.out.print("Please enter the highest number in the range: ");
        int endingNum = reader.nextInt();
        while (endingNum <= startingNum) {
            System.out.print("You have entered incorrect highest number. Please try again: ");
            endingNum = reader.nextInt();
        }

        System.out.println();

        for (int i = startingNum; i <= endingNum; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println();

        System.out.println("Numbers not displayed in this list are: ");
        for (int i = startingNum; i <= endingNum; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.print(i + " ");
                }
        }
        System.out.println();
    }
}