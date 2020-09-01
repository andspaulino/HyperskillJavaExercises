import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isAscending = false;
        boolean isDescending = false;
        boolean isFirst = true;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (isFirst) {
                temp = n;
                isFirst = false;
                continue;
            }
            if (n > temp) {
                isAscending = true;
                temp = n;
            }
            if (n < temp) {
                isDescending = true;
                temp = n;
            }
        }
        System.out.println(!isAscending || !isDescending);
    }
}