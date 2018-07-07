import java.util.Scanner;

public class Rotation {
    static void rotate(int n, int m[][]) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][n - 1 - i];
                m[j][n - 1 - i] = m[n - 1 - i][n - 1 - j];
                m[n - 1 - i][n - 1 - j] = m[n - 1 - j][i];
                m[n - 1 - j][i] = temp;
            }
        }
    }
    static void print(int n, int m[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " +m[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main (String[] args) {
        int n = 4;
        int mat[][] = { {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
        };
        rotate(n, mat);
        print(n, mat);
    }
}
