import java.util.Random;
import java.util.Scanner;

class QuickSort{

    int partition(int low, int high, int a[]){
        int pivot = low;
        int i = low;
        int j = high;
        while(i<j){
            while(a[i] <= a[pivot] && i<high)i++;
            while(a[j] >  a[pivot] && j>low)j--;
            if (i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            int temp1 = a[j];
            a[j] = a[low];
            a[low] = temp1;
        }
        return j;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int low, int high, int a[]){
        if (low < high){
            int pivot = partition(low, high, a);
            sort(low, pivot-1, a);
            sort(pivot+1, high, a);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {

        for(int j:arr){
            System.out.print(j+" "); }
    }

    // Driver method
    public static void main(String args[])
    {
        Scanner sc = new Scanner( System.in );
        int n,i;
        Random RD = new Random();

        System.out.print("Quick Sort Program \n");
        System.out.println("Enter number of integer elements");
        n = sc.nextInt();
        int arr[] = new int[ n ];

        sc.close();

        for ( i =0; i<n; i++){
            arr[i] = RD.nextInt(50);
        }

        System.out.println("Given Array");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.sort(0, n-1 , arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }
} 