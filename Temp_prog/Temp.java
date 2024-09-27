import java.util.Scanner;

public class Temp {
    int n, d, m, y;
    public Temp() {
        n = d = m = y = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day no. and year");
        n = sc.nextInt();
        y = sc.nextInt();
    }

    void day_to_date() {
        int A[] = {31, 28, 31, 30, 31, 30, 31, 31, 30,
                   31, 30, 31};
        
        if (y % 4 == 0) {
            A[1] += 1;
        }

        while (n > A[m]) {
            n -= A[m];
            m++;
        }
        d = n;
        m++;
    }

    void display() {
        String s = "";
        
        switch(m) {
            case 1: s = "January"; break;
            case 2: s = "February"; break;
            case 3: s = "March"; break;
            case 4: s = "April"; break;
            case 5: s = "May"; break;
            case 6: s = "June"; break;
            case 7: s = "July"; break;
            case 8: s = "August"; break;
            case 9: s = "September"; break;
            case 10: s = "October"; break;
            case 11: s = "November"; break;
            case 12: s = "December"; break;
        }

        System.out.println(s + " " + d + ", " + y);
    }

    public static void main (String args[]) {
        Temp t = new Temp();
        t.accept();
        t.day_to_date();
        t.display();
    }
}
