package practice_prog;

import java.util.Scanner;

public class Array2D_CrossDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        System.out.println("Enter array elemenets");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Array cross diagonal");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if((i==j)||(i+j==m-1))                              /*cross diagonal logic */
                System.out.print(a[i][j]+"\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        sc.close();
    }
}