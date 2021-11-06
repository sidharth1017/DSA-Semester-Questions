
import java.util.Scanner;

class binsearch{
    int []A;
    int m;
    int val;
    public binsearch(int []A,int n, int K){
        this.A=A;
        this.m=n;
        val=K;
    }
    public void sort(){
        int i=0;
        int j=m-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(val==A[mid]){
                System.out.println("key found at index:"+(mid+1));
                break;
            }
            if(val<A[mid]){
                j=mid-1;
            }
            if(val>A[mid]){
                i=mid+1;
            }
            if(val>A[j]){
                System.out.println("Not in array or not found");
                break;
            }
        }
    }

}

public class arrayBinarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("enter Values in array");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("enter no to find");
        int m=sc.nextInt();
        binsearch bs=new binsearch(A,n,m);
        bs.sort();
    }

}