import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 1;
        long result = 1;

        while (result <= m) {
            n++;

            result = result * n;
        }
        System.out.println(n);
    }
}