import java.util.*;

class linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit - ");
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter a number - ");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter a number to search - ");
        int num = sc.nextInt();

        for(i = 0; i < n; i++) {
            if(num == a[i]) {
                System.out.println("Number found at position " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}