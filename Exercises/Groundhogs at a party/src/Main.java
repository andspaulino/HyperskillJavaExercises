import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean weekday = numberOfCups >= 15 && numberOfCups <= 25 && isWeekend;
        boolean weekend = numberOfCups >= 10 && numberOfCups <= 20 && !isWeekend;
        System.out.println(weekday || weekend);
    }
}