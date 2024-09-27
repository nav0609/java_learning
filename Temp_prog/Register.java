import java.util.Scanner;

class Register {
    int std[], top, cap;

    Register(int max) {
        cap = max;
        top = -1;
        std = new int[cap];
    }

    void push(int n) {
        if (top == cap - 1)
            System.out.println("Overflow");
        else {
            std[++top] = n;
        }
    }

    int pop() {
        if (top == -1)
            return 00;
        else
            return std[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(std[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit of Register");
        int lim = sc.nextInt();
        Register ob = new Register(lim);
        int cond = 0, inp;
        System.out.println("If you want to add a number to the register input 1");
        cond = sc.nextInt();
        if (cond == 1) {
            System.out.println("Input a number");
            inp = sc.nextInt();
            ob.push(inp);
        } else {
            System.out.println("Enter number to take out");
        }
    }
}
