import java.util.*;

class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[10];
        int i;
        int uc = 0;
        int v = 0;
        for (i = 0; i <= 9; i++) {
            System.out.println("Enter a Character - ");
            ch[i] = sc.next().charAt(0);
        }
        for (i = 0; i <= 9; i++) {
            if (Character.isUpperCase(ch[i]))
                uc++;
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
                v++;
        }
        for (i = 9; i >= 0; i--) {
            System.out.println(ch[i]);
        }
        System.out.println("No. of uppercase characters - " + uc);
        System.out.println("No. of vowels - " + v);
    }
}
