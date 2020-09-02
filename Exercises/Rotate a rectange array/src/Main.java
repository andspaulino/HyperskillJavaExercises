import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len1 = scanner.nextInt();
        int len2 = scanner.nextInt();
        int[][] matrix = new int[len1][len2];
        int[][] rotatedMatrix = new int[len2][len1];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                rotatedMatrix[i][j] = matrix[len1 - j - 1][i];
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}