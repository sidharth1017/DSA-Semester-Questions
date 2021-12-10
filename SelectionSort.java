import java.util.*;
public class SelectionSort {

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random RAD = new Random();
        System.out.println("Bubble Sorting");
        int arr[] = new int[11];
        for (int i=0; i<11; i++){
            arr[i] = RAD.nextInt(1000);
        }
        System.out.println("Array before sorting:");
        for (int i=0; i<11; i++){
            System.out.print(arr[i] + " ");
        }
        sort(arr);
        System.out.println("\nArray after sorting:");
        for (int i=0; i<11; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
