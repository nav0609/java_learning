import java.util.*;

class EvenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs[] = new String[10];
        for (int i = 0;i<10;i++){
            System.out.println("Enter string" + (i+1) + ":");
            strs[i]=sc.nextLine();
        }
        System.out.println("String with even number of characters :");
        for (int i = 0;i<strs.length;i++){
            if (strs[i].length()%2 ==0){
                System.out.println(strs[i]);
            }
        }
    }
}
