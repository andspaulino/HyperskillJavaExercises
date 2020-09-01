import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        firstString = firstString.replace(" ", "");
        secondString = secondString.replace(" ", "");

        boolean isEqual = firstString.equalsIgnoreCase(secondString);

        System.out.print(isEqual);
    }
}