import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please specify how many numbers do you want to have in your array (between 1 and 15)");
        int desiredLength = reader.nextInt();
        if (desiredLength > 0 && desiredLength <= 15) {
            if (desiredLength <= 15) {
                int[] numArray = new int[desiredLength];
                String[] textArray = new String[]{"First number in the array is ", "Second number in the array is ", "Third number in the array is ", "Fourth number in the array is ", "Fifth number in the array is ", "Sixth number in the array is ", "Seventh number in the array is ", "Eighth number in the array is ", "Ninth number in the array is ", "Tenth number in the array is ", "Eleventh number in the array is ", "Twelfth number in the array is ", "Thirteenth number in the array is ", "Fourteenth number in the array is ", "Fifteenth number in the array is "};
                int elementNumber = 0;

                int j;
                for(j = 0; j < numArray.length; ++j) {
                    ++elementNumber;
                    System.out.println("Please enter the " + elementNumber + ". number");
                    numArray[j] = reader.nextInt();
                }

                System.out.println("------------------------------------");

                for(j = 0; j < numArray.length; ++j) {
                    System.out.println(textArray[j] + numArray[j]);
                }
            }
        } else {
            System.out.println("Sorry, you have entered invalid parameters");
        }

    }
}