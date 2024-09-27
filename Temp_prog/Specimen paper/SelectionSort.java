import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i;
        int j;
        int temp = 0;
        for (i = 0; i <= 4; i++) {
            System.out.println("Enter a number - ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i <= 4; i++) {
            int min_idx = i;
            for (j = i + 1; j < 4; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                    temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(i = 0; i <= 4; i++){
            System.out.println(arr[i]);
        }
    }
}
