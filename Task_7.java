import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] shortArray = new int[]{8, 6, 4, 18, 16, 14};
        int[] longArray = new int[]{2, 4, 6, 12, 14, 16, 50, 50, 50, 70};
        int shortArrayLength = shortArray.length;
        System.out.println("Sum of two arrays element-by-element is: ");

        for(int i = 0; i < shortArrayLength; ++i) {
            longArray[i] += shortArray[i];
        }

        System.out.println(Arrays.toString(longArray));
    }
}
