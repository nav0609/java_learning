import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[15];
        int i;
        int j;
        int temp = 0;
        for (i = 0; i <= 14; i++) {
            System.out.println("Enter a number - ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i <= 14; i++) {
            for (j = 0; j < 14 - i; j++) {
                if(arr[j] > arr[j+1]){           //(arr[j] > arr[j+1]) --> for assending order    
                    temp = arr[j];               //(arr[j] < arr[j+1]) --> for desending order
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(i = 0; i <= 14; i++){
            System.out.println(arr[i]);
        }
    }
}
