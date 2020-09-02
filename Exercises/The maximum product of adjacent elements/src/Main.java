import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int arrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                arrayIndex = i;
            }
        }

        if (arrayIndex == 0) {
            System.out.println(array[arrayIndex] * array[arrayIndex + 1]);
        } else if (arrayIndex == length - 1) {
            System.out.println(array[arrayIndex] * array[arrayIndex - 1]);
        } else if (array[arrayIndex + 1] > array[arrayIndex - 1]) {
            System.out.println(array[arrayIndex] * array[arrayIndex + 1]);
        } else if (array[arrayIndex + 1] < array[arrayIndex - 1]) {
            System.out.println(array[arrayIndex] * array[arrayIndex - 1]);
        } else {
            System.out.println(array[arrayIndex] * array[arrayIndex + 1]);
        }
    }
}