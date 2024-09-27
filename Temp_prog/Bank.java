//logical error
import java.util.*;

class Bank {
    String name;
    long accno;
    double amt;
    double p;

    Bank(String nm, Long ac, double pr, double amnt) {
        name = nm;
        accno = ac;
        amt = amnt;
        p = pr;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Account number : " + accno);
        System.out.println("Account Balance : " + p);
    }
}

class Account extends Bank {
    static Scanner sc = new Scanner(System.in);
    double amt;

    Account(String n, long acc, double pr, double AMT) {
        super(n, acc, pr, AMT);
        amt = AMT;
    }

    void deposit() {
        System.out.println("Enter amount to deposit ");
        amt = sc.nextDouble();
        p = p + amt;
    }

    void withdraw() {
        System.out.println("Enter ammount to withdraw ");
        amt = sc.nextDouble();
        if (amt > p)
            System.out.println("Insufficient balance");
        else {
            p = p - amt;
            if (p < 500)
                p = p - (500 - p) / 10;
        }
    }

    void display() {
        super.display();
    }

    public static void main(String[] args) {
        System.out.println("Enter name");
        String NAME = sc.nextLine();
        System.out.println("Enter account number");
        long account = sc.nextLong();
        System.out.println("Enter current balance");
        double cp = sc.nextDouble();
        Account ob = new Account(NAME, account, account, cp);
        System.out.println("Do you want to deposit the enter 1");
        int dep = sc.nextInt();
        if (dep == 1) {
            ob.deposit();
        } else {
            ob.withdraw();
        }
        ob.display();
    }
}