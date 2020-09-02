import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int check = scanner.nextInt();

        int counter = 0;
        for (int ch : array) {
            if (ch == check) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}