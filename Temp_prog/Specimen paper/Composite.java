import java.util.Scanner;

public class Composite {
    static Scanner sc = new Scanner(System.in);
    static int m, n;
    int arr[][];
    
    Composite(int nn, int mm) {
        n = nn;
        m = mm;
        arr = new int[n][m];
    }

    int isComposite(int p) {
        int cond = 1;
        for (int i = 1; i < p; i++) {
            if(p%i==0)
            cond++;
        }
        if (cond > 2)
            return 1;
        else
            return 0;
    }

    void fill() {
        // int in = 0;

        int temp[] = new int[m*n];

        int _count = 0;
        for (int j = 0; j < m*n; j++) {
            if (isComposite(j) == 1) {
                if (_count == m*n)
                    break;
                temp[_count] = j;
                _count++;
            }
        }

        _count = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                arr[i][j] = temp[_count];
                _count++;
                // while (in < (m * n)) {
                //     if (isComposite(++in) == 1) {
                //         arr[i][j] = in;
                //         break;
                //     }
                //     continue;
                // }
            }
        }
    }

    void display() {
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of rows");
        n = sc.nextInt();
        System.out.println("Enter no. of columns");
        m = sc.nextInt();
        Composite ob = new Composite(n, m);
        ob.fill();
        ob.display();
    }
}
