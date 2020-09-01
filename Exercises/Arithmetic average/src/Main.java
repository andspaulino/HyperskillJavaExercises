import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        double sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double calculation = sum / count;
        System.out.println(calculation);
    }
}