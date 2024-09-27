import java.util.Scanner;

public class Evil {
    Scanner sc = new Scanner(System.in);
    int num;
    int bin;

    Evil() {
        num = 0;
        bin = 0;
    }

    void acceptNum() {
        System.out.println("Enter a positve integer number -> ");
        num = sc.nextInt();
    }

    int rec_bin(int x) {
        if (x == 0)
            return bin= 0;
        else
            return (rec_bin(x/2)*10+(x%2));
    }

    void check() {
        int count = 0;
        String check = Integer.toString(rec_bin(num));
        for (int i = 0; i < check.length(); i++) {
            int ch = check.charAt(i);
            if (ch == '1')
                count++;
        }
        System.out.println("Binary equivalent = " + check);
        if (count % 2 == 0)
            System.out.println("The number is an Evil number");
        else
            System.out.println("The number is not an Evil number");
    }

    public static void main(String[] args) {
        Evil ob = new Evil();
        ob.acceptNum();
        ob.check();
    }
}
