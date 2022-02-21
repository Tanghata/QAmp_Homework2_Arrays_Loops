import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please specify how many numbers do you want to have in your array (between 1 and 15)");
        int desiredLength = reader.nextInt();

        if (desiredLength<=0 || desiredLength>15) {
            System.out.println("Sorry, you have entered invalid parameters");
        }

        else if (desiredLength<=15) {

            int[] numArray = new int[desiredLength];
            String[] textArray = new String[15];
            textArray[0] = "First number in the array is ";
            textArray[1] = "Second number in the array is ";
            textArray[2] = "Third number in the array is ";
            textArray[3] = "Fourth number in the array is ";
            textArray[4] = "Fifth number in the array is ";
            textArray[5] = "Sixth number in the array is ";
            textArray[6] = "Seventh number in the array is ";
            textArray[7] = "Eighth number in the array is ";
            textArray[8] = "Ninth number in the array is ";
            textArray[9] = "Tenth number in the array is ";
            textArray[10] = "Eleventh number in the array is ";
            textArray[11] = "Twelfth number in the array is ";
            textArray[12] = "Thirteenth number in the array is ";
            textArray[13] = "Fourteenth number in the array is ";
            textArray[14] = "Fifteenth number in the array is ";

            int elementNumber = 0;
            for (int i = 0; i < numArray.length; i++) {
                System.out.println("Please enter the " + ++elementNumber + ". number");
                numArray[i] = reader.nextInt();
            }
            System.out.println("------------------------------------");
            for (int j = 0; j < numArray.length; j++) {
                System.out.println(textArray[j] + numArray[j]);
            }
        }
    }
}