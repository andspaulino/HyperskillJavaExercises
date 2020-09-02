import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println(min);
    }
}