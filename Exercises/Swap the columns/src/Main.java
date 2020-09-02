import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len1 = scanner.nextInt();
        int len2 = scanner.nextInt();
        int[][] matrix = new int[len1][len2];
        int[][] matrixBackup = new int[len1][len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n < m) {
            swapMatrix(len1, len2, matrix, matrixBackup, m, n);
        } else {
            swapMatrix(len1, len2, matrix, matrixBackup, n, m);
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void swapMatrix(int len1, int len2, int[][] matrix, int[][] matrixBackup, int n, int m) {
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (j == m) {
                    matrixBackup[i][j] = matrix[i][j];
                    matrix[i][j] = matrix[i][n];
                } else if (j == n) {
                    matrix[i][j] = matrixBackup[i][m];
                }
            }
        }
    }
}