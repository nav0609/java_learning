//Program to deamonsttrate block scope of variables
public class Project6
{
    public static void main()
    {
        int a;
        a = 50;
        {
            int b;
            b = 100;
            System.out.println("Inner block: a,b are " + a + "," + b );
        }
        System.out.println("Outer block: a is " + a);
    }
}
        
        
     