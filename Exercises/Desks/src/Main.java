import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstClassroom = (scanner.nextInt() + 1) / 2;
        int secondClassroom = (scanner.nextInt() + 1) / 2;
        int thirdClassroom = (scanner.nextInt() + 1) / 2;
        int sum = firstClassroom + secondClassroom + thirdClassroom;

        System.out.println(sum);        // put your code here
    }
}
