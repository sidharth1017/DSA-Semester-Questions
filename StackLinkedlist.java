import java.util.Scanner;

/*  Class Node  */
class Node2{
    protected int data;
    public Node2 link;

    /* Default Constructor  */
    public Node2(){
        data=0;
        link=null;
    }
    /* Parameterize Constructor  */
    public Node2(int d,Node2 n){
        data=d;
        link = n;

    }

    /*  Method to set data to current Node  */
    public void setdata(int d){
        data=d;
    }
    /*  Method to get data from current Node  */
    public int getdata(){
        return data;
    }
    /*  Method to set link to next Node  */
    public void setlink(Node2 n){
        link = n;
    }
    /*  Method to get link to next node  */
    public Node2 getlink(){
        return link;
    }

}

/* Class Stack_Linked_list */
class Stack_Linked_list
{
    public Node2 top;
    public int size, Max;

    /*  Constructor  */
    public Stack_Linked_list(int n){
        Max = n;
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }
    public boolean isFull(){
        return size == Max;
    }
    /*  Method to insert an node at beginning  */
    public void push(int a){
        if (isFull()) System.out.println("Overflow");
        else{
            Node2 new_node = new Node2 (a,null);
            if (top==null){
                top = new_node;
            }else {
                new_node.setlink(top);
                top=new_node;
            }
            size++ ;
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        else{
            Node2 ptr = top;
            top=top.getlink();
            size-- ;
            return ptr.getdata();
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Underflow");
            return -1;
        }else{
            return top.getdata();
        }
    }
    public void display(){
        System.out.println("Stack is: ");
        if (size==0){
            System.out.println("Empty");
        }else {
            Node2 ptr = top;
            while(ptr != null){
                System.out.print(ptr.getdata()+ " -> ");
                ptr = ptr.getlink();
            }
            System.out.println();
        }
    }
    /*  Method to get size of linked list */
    public int getSize()
    {
        return size;
    }

}
/*  Class StackLinkedlist  */
public class StackLinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Stack Using Linked List:- ");
        /* Creating object of class Linked_List */
        System.out.println("Enter the size of Stack");
        int n = sc.nextInt();
        Stack_Linked_list list = new Stack_Linked_list(n);
        char ch;
        /*  Perform list operations  */
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Size");
            System.out.println("6. Display");

            System.out.println("Enter your choice: ");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Number to push: ");
                    list.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Popped Element: " + list.pop());
                    break;
                case 3:
                    System.out.println("Peek Element: " + list.peek());
                    break;
                case 4 :
                    System.out.println("Empty or Not: "+ list.isEmpty());
                    break;
                case 5 :
                    System.out.println("Size of Linked List is= "+ list.getSize() +" \n");
                    break;
                case 6 :
                    System.out.println("Stack is: " );
                    list.display();
                    break;
            }
            list.display();
            System.out.println("Do you want to continue: ");
            ch=sc.next().charAt(0);
        }
        while(ch == 'y'||ch =='Y');
    }

}
