import java.util.*;

class Equalcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String - ");
        String str1 = sc.nextLine().toUpperCase();
        System.out.println("Enter another String -");
        String str2 = sc.nextLine().toUpperCase();
        if (str1.compareTo(str2) == 0){
            System.out.println("Strings are equal");
        }
        else if(str1.length()>str2.length()) {
            System.out.println(str1);
        }
        else {
            System.out.println(str2);
        }  
    }    
}
