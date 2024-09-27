import java.util.Scanner;

class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[10];
        int i, c, l;
        for (i = 0; i <= 9; i++) {
            ;
            System.out.println("Enter a String");
            str[i] = sc.nextLine();
        }
        for (i = 0; i <= 9; i++) {
            l = str[i].length();
            if (l % 2 == 0)
                System.out.println("String with Even no. Characters =" + str[i]);
        }
    }
}