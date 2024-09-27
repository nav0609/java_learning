/*
Logical Operaters :=
1. &&
2. ||
*/

import java.util.Scanner;

class conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number -");
        double x = sc.nextDouble();
        System.out.println("Enter another number -");
        double y = sc.nextDouble();
        
        if (x == y && x < 100) {
            System.out.println("Both values are less than 100");
        }
        else if (x == y || x < y) {
            System.out.println("First value is less than or equal to second one");
        }
        else {
            System.out.println("Both values are not equal");
        }

        sc.close();
    }
}