package practice_prog;

import java.util.*;

public class Array2D_MirrorImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        System.out.println("Enter array elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == m - 1) && (j == 0 || j == m - 1))
                    sum = sum + a[i][j];
            }
        }
        System.out.println("Sum of corner elements is " + sum);
        System.out.println("Mirror image of array");
        int newa[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                newa[i][m - 1 - j] = a[i][j]; /* Mirror matix logic */
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newa[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}