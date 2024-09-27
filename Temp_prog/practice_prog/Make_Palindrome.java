package practice_prog;

import java.util.*;

public class Make_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine().toUpperCase();
        char lastChar = s.charAt(s.length() - 1);
        if (lastChar != '!' && lastChar != '.' && lastChar != '?')
            System.out.println("Invalid input");
        else {
            s = s.substring(0, s.length() - 1) + " ";
            String x = "", y = "", str = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != ' ') {                            // Selecting word from sentence
                    x = x + ch;
                    y = ch + y;
                } else {
                    if (x.equalsIgnoreCase(y)) {            // leaving as it is if the word is already palindrome
                        str = str + " " + x;
                        x = "";
                        y = "";
                    } else {
                        str = str + " " + x + y + " ";      // making selected word palindrome
                        x = "";
                        y = "";
                    }
                }
            }
            System.out.println("Modified sentence " + str);
        }
        System.out.println("Original sentence " + s);
        sc.close();
    }
}
