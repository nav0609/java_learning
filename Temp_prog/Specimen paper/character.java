import java.util.*;

class character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        char ch[] = new char[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.println("Enter a Character -");
            ch[i] = sc.next().charAt(0);
        }
        int up = 0;
        int vo = 0;

        for (i = 0; i < n; i++) {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
                vo++;
            }
            if (Character.isUpperCase(ch[i])) {
                up++;
            }
        }
        System.out.println("Number of vowels are - " + vo);
        System.out.println("Number of uppercase letters are - " + up);
    }
}