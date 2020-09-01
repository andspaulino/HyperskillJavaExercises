import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();

        firstNumber = --firstNumber;
        secondNumber = --secondNumber;
        thirdNumber = --thirdNumber;
        fourthNumber = --fourthNumber;

        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        System.out.print(thirdNumber + " ");
        System.out.println(fourthNumber); // put your code here
    }
}