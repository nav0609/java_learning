import java.util.*;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[5];
        double sum = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a number - ");
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i <= 4; i++) {
            sum += arr[i];
        }
        double small = arr[0];
        double great = arr[0];
        for (int i = 0; i < 4; i++) {
            if (arr[i] < small)
                small = arr[i];
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] > great)
                great = arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Smallest number - " + small);
        System.out.println("Greatest number - " + great);
    }
}
