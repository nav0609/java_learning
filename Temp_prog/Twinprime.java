import java.util.*;

class Twinprime {

    static boolean Twinprime(int num) {
        int i;
        int t = 0;
        int flag = 0;
        t = num / 2;
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (i = 2; i < t; i++) {
                if (num % i == 0) {
                    flag = 1;
                    return false;
                }
            }
            if (flag == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean Twinprime(int n1, int n2) {
        if (Twinprime(n1) && Twinprime(n2) && Math.abs(n1 - n2) == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int n = sc.nextInt();
        System.out.println("Enter lower limit");
        int m = sc.nextInt();
        System.out.println("The prime pair between " + n + " and " + m + " are :");
        for(int i =n;i<m;i++){
            if(Twinprime(i, (i+2))){
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
        sc.close();
    }
}
