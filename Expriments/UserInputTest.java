import java.util.Scanner;

class UserInputTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        double a = sc.nextDouble();
        System.out.println(a % 2.0 == 0 ? "the no. is even" : "the no. is odd");
    }
}