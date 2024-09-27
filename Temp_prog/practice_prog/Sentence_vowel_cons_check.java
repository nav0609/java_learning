package practice_prog;

import java.util.*;

public class Sentence_vowel_cons_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine().toUpperCase();
        char lastchar = s.charAt(s.length() - 1);
        if (lastchar != '.' && lastchar != '!' && lastchar != '?')
            System.out.println("invalid input");
        else {
            s = s.substring(0, s.length() - 1) + " ";
            String x = "", y = "", str = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ')                                   //Detecting and getting a word
                    str = str + ch;
                else {
                    char ch1 = str.charAt(0);              //first character of the selected word
                    char ch2 = str.charAt(str.length() - 1);     //last character of the selected word
                    if ((ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')             //checkin vowel or consonant 
                            && (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U'))
                        x = x + str + " ";                       // storing vowel word
                    else
                        y = y + str + " ";                       // storing consonant word
                    str = "";                                    // resetting the selected word
                }
            }
            System.out.println(x + " " + y);
        }
        sc.close();
    }
}