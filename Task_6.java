import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{12, 33, 54, 75, 96, 171, 183, 115};
        int[] secondArray = new int[]{22, 44, 65, 87, 150, 132, 1466, 166};
        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;
        int[] concatArray = new int[firstArrayLength + secondArrayLength];
        System.arraycopy(firstArray, 0, concatArray, 0, firstArrayLength);
        System.arraycopy(secondArray, 0, concatArray, firstArrayLength, secondArrayLength);
        System.out.println(Arrays.toString(concatArray));
    }
}