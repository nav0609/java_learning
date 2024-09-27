import java.util.Scanner;

public class ConsChange {
    String word;
    int len;

    ConsChange() {
        word = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.next().toLowerCase();
        len = word.length();
    }

    void shiftcons() {
        String v = "", c = "";
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                v += ch;
            else
                c += ch;
        }
        word = c + v;
        System.out.println("shifted word " + word);
    }

    void changeword() {
        String s = "";
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                s += (char) (ch - 32);
            else
                s += ch;
        }
        System.out.println("changed word " + s);
    }

    void show() {
        System.out.println("Original word " + word);
        shiftcons();
        changeword();
    }

    public static void main(String[] args) {
        ConsChange ob = new ConsChange();
        ob.readword();
        ob.show();
    }
}
