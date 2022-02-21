import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rangeStart, rangeEnd = 0;

        System.out.println("Please enter the lowest number in the range: ");
        rangeStart = reader.nextInt();

        System.out.println("Please enter the largest number in the range: ");
        rangeEnd = reader.nextInt();

        if (rangeEnd <= rangeStart) {
            System.out.println("You have entered incorrect parameters");
        } else if (rangeEnd - 1 == rangeStart) {
            System.out.println("There are no even numbers between " + rangeStart + " and " + rangeEnd);
        } else if (rangeEnd - 2 == rangeStart && rangeStart % 2 == 0) {
            System.out.println("There are no even numbers between " + rangeStart + " and " + rangeEnd);
        } else if (rangeEnd - 3 != rangeStart && (rangeEnd - 2 != rangeStart || rangeStart % 2 == 0) && (rangeEnd - 4 != rangeStart || rangeStart % 2 != 0)) {
            System.out.print("Even numbers between " + rangeStart + " and " + rangeEnd + " are: ");
        } else {
            System.out.print("The only even number between " + rangeStart + " and " + rangeEnd + " is ");
        }

        for(int i = rangeStart + 1; i < rangeEnd; ++i) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
