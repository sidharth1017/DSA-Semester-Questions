import java.util.*;
public class arrayinsertion {
    public static void main(String[] args) {

        int pos,val,i,size;
        int a[] = new int [10];
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Array Size:- ");
        size = ip.nextInt();
        System.out.println("Enter Values in Array:- ");
        for (i=0; i<=size-1;i++)
        {
            a[i] = ip.nextInt();
        }
        System.out.println("Values in Array are:- ");
        for (i=0; i<=size-1;i++)
        {
            System.out.print(a[i]+ " ");
        }

        System.out.println("\nEnter the value you want to insert:- ");
        val = ip.nextInt(); //it will take value that user wants to insert
        System.out.println("Enter the position");
        pos = ip.nextInt(); //it will take position where user wants to insert
        i = size-1; //it will take value the index postion for ex my array size is 5 then i will be 4
        while (i>=pos) //This while loop start from (size -1) last index of array to the postion where new value will be inserted
        {
            a[i+1] = a[i]; //This will shift value to the next postion
            i--;   //This will decrease loop
        }
        a[pos]= val;  // This will insert the value at given postion
        size = size+1; //This will increase the size of array

        System.out.println("Insertion is succesfull");
        System.out.println("new array after insertion");
        for (i=0; i<size;i++)
        {
            System.out.print(a[i]+ " ");
        }

    }
}
