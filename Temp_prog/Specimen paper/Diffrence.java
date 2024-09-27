import java.util.*;

class Diffrence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First character ->");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter Second Number ->");
        char ch2 = sc.next().charAt(0);
        int d = ch1-ch2;
        if(d == 0){
            System.out.println("Both Characters are same");
        }
        if(d<0){
            System.out.println("First Character is smaller");
        }
        if(d>0){
            System.out.println("Second Character is smaller");
        } 
    }
}
