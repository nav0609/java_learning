package practice_prog;

import java.util.*;

public class Goldbatch {
    public static boolean isprime(int num) {
        int flag = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)               /*logic for checking prime */
                flag++;
        }
        return flag==2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n <= 9 || n >= 100) {
            System.out.println("Invalid input, number is out of range.");
            return;
        }
        if (n % 2 != 0) {                   /*logic for checking even */
            System.out.println("Invalid Input, number is odd");
            return;
        }
        System.out.println("Prime pairs are :");
        int a = 3, b = 0;
        while (a <= n / 2) {
            b = n - a;
            if (isprime(a) && isprime(b)) {
                System.out.println("(" + a + "," + b + ")");
            }
            a += 2;
        }
    }
}
