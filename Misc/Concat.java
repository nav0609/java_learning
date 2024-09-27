import java.util.Scanner;

class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String -");
        String str1, str2, str3;
        str2 = sc.nextLine();
        System.out.println("Enter Second string -");
        str1 = sc.nextLine();
        str3 = str2.concat(str1);
        System.out.println("The concated String is -" + str3);
    }
}