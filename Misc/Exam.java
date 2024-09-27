import java.util.Scanner;

class Exam {
    int n_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n -> ");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String arg[]) {
        Exam examObj = new Exam();

        int num,k,j, i;

        int n = examObj.n_input();

        for (i = n; i >= 0; i--) {
            num = n;
            for (k = 0; k <= n-i; k++) {
                System.out.print(" ");
            }

            for (j = i; j >= 0; j--) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}