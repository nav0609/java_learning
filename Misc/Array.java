import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] a = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Enter a number -");
            a[i] = sc.nextInt();
        }
        System.out.println("Numbers in reverse order are -");
        for (i = 9; i > 0; i--) {
            int r = a[i];
            System.out.println(r);
        }
    }
}