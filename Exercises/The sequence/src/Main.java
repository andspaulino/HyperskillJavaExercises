import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = scanner.nextInt();
        int counter = range;

        for (int i = 0; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                if (counter > 0) {
                    System.out.print(i + " ");
                    counter--;
                } else {
                    break;
                }
            }
        }
    }
}