import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        double profitYear = scanner.nextDouble();
        double desirableAmount = scanner.nextDouble();
        int counter = 0;

        while (money < desirableAmount) {
            money += (money * profitYear) / 100;
            counter++;
        }
        System.out.println(counter);
    }
}