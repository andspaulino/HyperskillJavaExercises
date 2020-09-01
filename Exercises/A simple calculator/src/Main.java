import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = scanner.nextBigInteger();
        char operator = scanner.next().charAt(0);
        BigInteger secondNumber = scanner.nextBigInteger();

        switch (operator) {
            case '+':
                System.out.println(firstNumber.add(secondNumber));
                break;
            case '-':
                System.out.println(firstNumber.subtract(secondNumber));
                break;
            case '/':
                if (secondNumber.equals(BigInteger.ZERO)) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber.divide(secondNumber));
                break;
            case '*':
                System.out.println(firstNumber.multiply(secondNumber));
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}