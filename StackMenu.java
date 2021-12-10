import java.util.Scanner;
class ArrayStack{
    int[]stack;
    int Max,t, count=0;
    public ArrayStack(int n){
        Max = n;
        t = 0;
        stack = new int[Max];
    }
    public void push(int val){
        if(t == Max-1)
            System.out.println("overflow");
        else {
            t=t+1;
            stack[t]=val;
        }
    }
    public void pop()       {
        if (t == -1){
            System.out.println("underflow");
        }
        else{
            System.out.println(stack[t]);
            t=t-1;
        }
    }
    public int peek(){
        return stack[t];
    }

    public boolean overflow(){
        return t == Max-1;
    }
    public boolean underflow(){
        return (t == -1);
    }

    public void display()       {
        if (t == -1){
            System.out.println("underflow");
        }
        else{ System.out.print("Stack is= ");
            for(int i=t; i>0; i--){
                System.out.print(stack[i]+" ");
            }
        }
    }
    public int totalq()       {
        if (t == -1){
            System.out.println("underflow");
            return 0; }
        else{
            for(int i=t;i<=t;i--){
                count++;}
            return count;
        }
    }
}
public class StackMenu {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack Implementation with Array");
        System.out.println("Enter Size of Stack=");
        int n = sc.nextInt();
        ArrayStack ST = new ArrayStack(n);
        do{
            System.out.println("Stack Operations");
            System.out.println("1.Push \n"+"2.Pop \n"+"3.Peek \n"+ "4.Display \n"+"5.Overflow Check \n"+"6.Underflow Check\n" +"7.Total elements in stack\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Push operation input a number");
                    int val= sc.nextInt();
                    ST.push(val);
                    break;
                case 2:
                    System.out.println("Pop operation");
                    ST.pop();
                    break;
                case 3:
                    System.out.println("Peek Operation " + ST.peek());
                    break;
                case 4:
                    System.out.println("display operation");
                    ST.display();
                    break;
                case 5:
                    System.out.println("Overflow status = "+ ST.overflow());
                    break;
                case 6:
                    System.out.println("Empty status = "+ ST.underflow());
                    break;
                case 7:
                    System.out.println("Total Elements in queue are "+ ST.totalq());
                    break;
                default:
                    System.out.println("invalid input");
            }
            ST.display();
            System.out.println("\nDo you want to continue(y/n)");
            ch= sc.next().charAt(0);
        }
        while(ch == 'y' || ch == 'Y');
    }
}