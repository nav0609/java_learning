import java.util.Scanner;

class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        int j;
        for (int i = a; i <= b; i++){
            j = (int) (Math.pow(i, 3));
            System.out.println(i + " ^ 3 = " + j);
        }
    }
}