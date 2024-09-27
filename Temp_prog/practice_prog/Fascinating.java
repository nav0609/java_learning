package practice_prog;
import java.util.*;

class Fascinating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        int n2 = n1 * 2;
        int n3 = n1 * 3;
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String s3 = Integer.toString(n3);
        String concatstr = s1 + s2 + s3;
        boolean cond = true;
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < concatstr.length(); i++) {
                char ch = concatstr.charAt(i);
                if (ch == c)
                    count++;
            }
            if (count > 1 || count == 0) {
                cond = false;
                break;
            }
        }
        if (cond) {
            System.out.println("Number entered is a fascinating number");
        } else {
            System.out.println("Number entered is not a fascinating number");
        }
        sc.close();
    }
}
