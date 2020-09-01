import java.util.Scanner; //put imports you need here

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cuisinePreference = scanner.next();


        System.out.print("The form for ");
        System.out.print(firstName);
        System.out.print(" is completed. We will contact you if we need a chef that cooks ");
        System.out.print(cuisinePreference);
        System.out.println(" dishes."); // put your code here
    }
}