import java.util.*;
public class InsertionSort {

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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
