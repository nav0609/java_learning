import java.util.Scanner;

class CoronaCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age -");
        int age = sc.nextInt();
        System.out.println("do you have Depression  enter 1 for yes and 0 for no -");
        int choiceofdeath = sc.nextInt();

        if (choiceofdeath == 1)
        {
            System.out.println((age <= 50) ? "DIE!!" : "Die anyways");
        }
        else if (choiceofdeath == 0)
        {
            System.out.println("kill yourself"); 
        }
        else
        {
            System.out.println("Enter correct choice");
        }
    }
}