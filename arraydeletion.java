import java.util.*;
public class arraydeletion {
    public static void main(String[] args) {
        int val, pos, i, size;
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

        System.out.println("Enter the position");
        pos = ip.nextInt();
        i = pos + 1;
        while(i<size){
            a[i-1] = a[i];
            i = i+1;
        }
        size = size - 1;
        System.out.println("Deletion is succesfull");
        System.out.println("new array after deletion");
        for (i=0; i<size;i++)
        {
            System.out.print(a[i]+ " ");
        }

    }

}
