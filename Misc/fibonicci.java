import java.util.Scanner;

class fibonicci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n -");
        int n = sc.nextInt();int a = 0,b = 1,c = 0,i;
        System.out.print(a +"  "+ b);

        for(i=3;i<=n;i++){
            c = a + b;
            System.out.print("  " + c);
            a=b;
            b=c;
        }
    }
}
