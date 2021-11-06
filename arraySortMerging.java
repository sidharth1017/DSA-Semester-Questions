import java.util.*;
public class arraySortMerging {
    public static void main(String[] args) {
        int s1, s2, i=0, j=0, k=0;
        int A[] = {1, 3, 5, 7, 8};
        int B[] = {2, 4, 6};
        int C[] = new int [A.length+B.length];
        Scanner sc = new Scanner(System.in);

        while((i<A.length) && (j<B.length)){
            if(A[i] < B[j]){
                C[k] = A[i];
                k++;
                i++ ;
            }
            else{
                C[k] = B[j];
                k=k+1;
                j=j+1;
            }
        }
        while(i<(A.length)){
            C[k] = A[i];
            k++;
            i++;
        }
        while(j<(B.length)){
            C[k] = B[j];
            k++;
            j++;
        }
        System.out.print(" \nValues of new Sorted Mergeed array is:- ");
        for(i=0; i<(A.length+B.length); i++){
            System.out.print(C[i] + " ");
        }

    }
}
