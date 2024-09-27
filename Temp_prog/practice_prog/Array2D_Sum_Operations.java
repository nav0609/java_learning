package practice_prog;
import java.util.Scanner;

class Array2D_Sum_Operations {
    int sum;
    int size;
    int[][] t;

    Array2D_Sum_Operations(int size, int[][] t) {
        this.size = size;
        this.t = t;
        System.out.println("Initialized two vars");
    }

    void Sum_of_Left_Diagonal() {
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    sum = sum + t[i][j];
            }
        }
    }

    void Sum_of_Right_Diagonal() {
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1)
                    sum = sum + t[i][j];
            }
        }
    }

    void Sum_of_Boundary() {
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
                    sum = sum + t[i][j];
            }
        }
    }

    void Sum_of_Corner() {
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j == 0 || j == size - 1))
                    sum = sum + t[i][j];
            }
        }
    }
}

class Executor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int m = sc.nextInt();
        int a[][] = new int[m][m];
        System.out.println("Enter array elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original array -");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        Array2D_Sum_Operations ob = new Array2D_Sum_Operations(m, a);
        System.out.println("Enter the operation that you want to perform");
        System.out.println("Enter 1 for sum of left diagonal");
        System.out.println("Enter 2 for sum of right diagonal");
        System.out.println("Enter 3 for sum of Boundary elements");
        System.out.println("Enter 4 for sum of Corner elements");
        int cond = sc.nextInt();
        
        switch (cond) {
            case 1:
                ob.Sum_of_Left_Diagonal();
                break;
            case 2:
                ob.Sum_of_Right_Diagonal();
                break;
            case 3:
                ob.Sum_of_Boundary();
                break;
            case 4:
                ob.Sum_of_Corner();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Sum of elements = " + ob.sum);
        sc.close();
    }
}
