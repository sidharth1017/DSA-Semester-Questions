import java.util.Scanner;

/*  Class Node  */
class Node3{
    protected int data;
    public Node3 link;

    /* Default Constructor  */
    public Node3(){
        data=0;
        link=null;
    }
    /* Parameterize Constructor  */
    public Node3(int d,Node3 n){
        data=d;
        link = n;

    }

    /*  Method to set data to current Node  */
    public void setdata(int d){data=d;}
    /*  Method to get data from current Node  */
    public int getdata(){return data;}
    /*  Method to set link to next Node  */
    public void setlink(Node3 n){link = n;    }
    /*  Method to get link to next node  */
    public Node3 getlink(){return link;}

}

/* Class Queue_Linked_list */
class Queue_Linked_list
{
    public Node3 top;
    public int size, Max;

    /*  Constructor  */
    public Queue_Linked_list(int n){
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
    public void enque(int a){
        if (isFull()) System.out.println("Overflow");
        else{
            Node3 new_node = new Node3 (a,null);
            if (top==null){
                top = new_node;
            }else {
                Node3 ptr=top;
                while(ptr.getlink()!=null){
                    ptr=ptr.getlink();
                }
                new_node.setlink(null);
                ptr.setlink(new_node);
            }
            size++ ;
        }
    }
    public int deque(){
        if (isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        else{
            Node3 ptr = top;
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
            Node3 ptr = top;
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
/*  Class QueueLinkedlist  */
public class QueueLinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Queue Using Linked List:- ");
        /* Creating object of class Linked_List */
        System.out.println("Enter the size of Queue");
        int n = sc.nextInt();
        Queue_Linked_list list = new Queue_Linked_list(n);
        char ch;
        /*  Perform list operations  */
        do{
            System.out.println("1. Enque");
            System.out.println("2. Deque");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Size");
            System.out.println("6. Display");

            System.out.println("Enter your choice: ");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Number to enque: ");
                    list.enque(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Deque Element: " + list.deque());
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
                    System.out.println("Queue is: " );
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