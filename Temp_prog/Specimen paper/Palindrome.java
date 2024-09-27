import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string - ");
        String str = sc.nextLine().toLowerCase();
        String str_reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            str_reversed += str.charAt(i);
        }

        if (str.compareTo(str_reversed) == 0) {
            System.out.println("String is palindrome.");
        }
        else {
            System.out.println("String is not palindrome.");
        }

        sc.close();
    }
}
