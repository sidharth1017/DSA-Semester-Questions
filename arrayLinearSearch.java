import java.util.*;
public class arrayLinearSearch {
    public static void main(String[] args) {
        int size, val, i;
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        size = sc.nextInt();
        System.out.println("Enter Values in array:- ");
        for(i=0; i<size; i++){
           a[i] = sc.nextInt();
        }
        System.out.println("Values in Array are:- ");
        for (i=0; i<=size-1;i++)
        {
            System.out.print(a[i]+ " ");
        }

        //Algorithm starts from here

        System.out.println("\nEnter the value you want to search:- "); //It is asking for value that user wants to search
        val = sc.nextInt();
        int count = 0; //Initalised count = 0
        for (i = 0; i <= size-1; i++) //This for loop starts from 0 and run till the length of array
        {
            if (a[i] == val)     // Searching element is present or not
            {
                count = count +1; //if present stores in count
            }
        }
        if (count == 0)
            System.out.println(val + " isn't present in array."); //if value not present then count will be 0 and value isnt present in array
        else{
            System.out.println(val + " is "+count+" time in array"); // This will print how much time that value is stored in array
        }
    }


}

