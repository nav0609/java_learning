import  java.util.Scanner;

class Scanner0 {
    public static double sample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in decimal -> ");
        double d = sc.nextDouble();
        return d;
    }
    public static double multiple() { 
        System.out.println("Enter two numbers that you want to multiply");
        double m = sample();
        double n = sample();
        return m*n;
    }

    public static void main(String[] args) {
        System.out.println("Your multiplied result -> " + multiple());
    }
}