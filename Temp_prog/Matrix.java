import java.util.*;

class Matix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int m = sc.nextInt();
        System.out.println("Enter no. of columns");
        int n = sc.nextInt();
        if ((n > 2 && n < 10) && (m > 2 && m < 10)) {
            int a[][] = new int[n][m];
            System.out.println("Enter array elements");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter original matrix is");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            int b[]=new int [m*n];
            int x=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[x]=a[i][j];
                    x++;
                }
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x-i-1; j++) {
                    if(b[j]>b[j+1]){
                        int temp=b[j];
                        b[j]=b[j+1];
                        b[j+1]=temp;
                    }
                }
            }
            x=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j]=b[x];
                    x++;
                }
            }
            System.out.println("Array after sorting");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}