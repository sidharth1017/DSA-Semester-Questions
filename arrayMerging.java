import java.util.*;
public class arrayMerging {
    public static void main(String[] args) {
        int s1, s2, i, j, k;
        int A[] = new int [10];
        int B[] = new int [10];
        int C[] = new int [A.length+B.length];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array 1 (A):- ");
        s1 = sc.nextInt();
        System.out.println("Enter Values in array:- ");
        for(i=0; i<s1; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2 (B):- ");
        s2 = sc.nextInt();
        System.out.println("Enter Values in array:- ");
        for(j=0; j<s2; j++){
            B[j] = sc.nextInt();
        }

        System.out.print("Values in Array 1 (A) are:- ");
        for (i=0; i<=s1-1;i++)
        {
            System.out.print(A[i]+ " ");
        }
        System.out.print("\nValues in Array 2 (B) are:- ");
        for (j=0; j<=s2-1;j++)
        {
            System.out.print(B[j]+ " ");
        }

        //Algorithm starts from here
        for(k=0, i=0; i<s1; i++, k++){
            C[k] = A[i];
        }
        for(k=s1, j=0; j<(s1+s2); j++, k++){
            C[k] = B[j];
        }
        System.out.print(" \nValues of new Mergeed array is:- ");
        for(k=0; k<(s1+s2); k++){
            System.out.print(C[k] + " ");
        }
    }
}
