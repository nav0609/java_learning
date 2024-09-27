//this program is prepared to understand the working of the conditional operator
class Project3
{
    public static void main(String args[])
    {
        int x, y;
        x = 43;
        //CASE 1
        y = x < 0 ? x+2:x-2;
        System.out.println("Output of case 1="+ y);
        
        //CASE 2
        y = x > 0 ? x+3:x-3;
        System.out.println("Output of case 2="+ y);
    }
}