import java.util.Random;
import java.util.Scanner;

class MergeSort{

    void merge(int arr[], int low, int m, int high)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - low + 1;
        int n2 = high - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[low + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = low;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }


        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            // Find the middle point
            int m = (low+high)/2;

            // Sort first and second halves
            sort(arr, low, m);
            sort(arr , m+1, high);

            // Merge the sorted halves
            merge(arr, low, m, high);
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

        System.out.print("Merge Sort Program \n");
        System.out.println("Enter number of integer elements");
        n = sc.nextInt();
        int arr[] = new int[ n ];
        /* Accept elements */
        //System.out.print("Enter "+ n +" integer elements");
        sc.close();
        for ( i =0; i<n; i++)
        {arr[i] = RD.nextInt(50);}

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
} 