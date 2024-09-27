import java.util.*;

class Specimen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit - ");
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter a number - ");
            a[i] = sc.nextInt();
        }
        int small = a[0];
        int great = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] < small)
                small = a[i];
        }
        for (i = 0; i < n; i++) {
            if (a[i] > great)
                great = a[i];
        }
        System.out.println("Smallest number - " + small);
        System.out.println("Greatest number - " + great);
    }
}