import java.util.Scanner;

class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x -");
        int x = sc.nextInt();
        double s = 0.0d;

        for (int i = 1; i <= x; i++) {
            s += Math.pow(i,i);
        }
        
        System.out.println("Sum - " + s);
    }
}