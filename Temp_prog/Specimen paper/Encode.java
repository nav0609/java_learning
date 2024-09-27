import java.util.Scanner;

public class Encode {
    Scanner sc = new Scanner(System.in);
    String word, new_word;
    int length;
    char[] sVow = { 'a', 'e', 'i', 'o', 'u', 'a' };
    char[] cVow = { 'A', 'E', 'I', 'O', 'U', 'A' };

    Encode() {
        word = "";
        new_word = "";
        length = 0;
    }

    void acceptWord() {
        System.out.println("Enter a word");
        word = sc.next();
        length = word.length();
    }

    void nextVowel() {
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            for (int j = 0; j < sVow.length; j++) {
                if (ch == sVow[j]){
                    ch = sVow[j+1];
                    break;
                }
                else if (ch == cVow[j]) {
                    ch = cVow[j+1];
                    break;
                }
            }
            new_word += ch;
            // switch (ch) {
            // case 'a':
            // ch = 'e';
            // break;
            // case 'e':
            // ch = 'i';
            // break;
            // case 'i':
            // ch = 'o';
            // break;
            // case 'o':
            // ch = 'u';
            // break;
            // case 'u':
            // ch = 'a';
            // break;
            // case 'A':
            // ch = 'E';
            // break;
            // case 'E':
            // ch = 'I';
            // break;
            // case 'I':
            // ch = 'O';
            // break;
            // case 'O':
            // ch = 'U';
            // break;
            // case 'U':
            // ch = 'A';
            // break;
            // default:
            // break;
            // }
            // new_word += ch;
        }
    }

    void display() {
        System.out.println("Original word is " + word);
        System.out.println("Encrypted word is " + new_word);
    }

    public static void main(String[] args) {
        Encode ob = new Encode();
        ob.acceptWord();
        ob.nextVowel();
        ob.display();
    }
}
