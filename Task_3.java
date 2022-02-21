public class Task_3 {
    public static void main(String[] args) {
        int[] integerArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println();
        System.out.print("Initial Array: ");

        int j;
        for(j = 0; j < integerArray.length; ++j) {
            System.out.print(integerArray[j] + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.print("Array in reverse order: ");

        for(j = integerArray.length - 1; j >= 0; --j) {
            System.out.print(integerArray[j] + " ");
        }

        System.out.println();
    }
}