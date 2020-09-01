import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isIt = n > 0 && n < 10;
        System.out.println(isIt);
    }
}