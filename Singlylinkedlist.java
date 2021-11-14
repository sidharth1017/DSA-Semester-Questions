import java.util.Scanner;

/*  Class Node  */
class Node{
    protected int data;
    public Node link;

    /* Default Constructor  */
    public Node(){
        data=0;
        link=null;
    }
    /* Parameterize Constructor  */
    public Node(int d,Node n){
        data=d;
        link=n;

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
    public void setlink(Node n){
        link=n;
    }
    /*  Method to get link to next node  */
    public Node getlink(){
        return link;
    }

}

/* Class Linked_List */
class Linked_list
{
    public Node head;
    public int size;

    /*  Constructor  */
    public Linked_list(){
        head=null;
        size =0;
    }

    /*  Method to insert an node at beginning  */
    public void insertAtstart(int a){
        Node new_node=new Node(a,null);
        new_node.setlink(head);
        head=new_node;
        size++ ;
    }
    /*  Method to insert an node at the end */
    public void insertAtend(int b){

        Node new_Node=new Node(b, null);
        Node ptr=head;
        while(ptr.getlink()!=null){
            ptr=ptr.getlink();
        }

        new_Node.setlink(null);
        ptr.setlink(new_Node);
        size++ ;
    }
    /*  Method to insert an node before given position */
    public void insertBeforePos(int c, int beforepos){

        Node new_Node=new Node(c, null);
        Node ptr = head;
        for(int i=0; i < beforepos-1; i++){
            ptr = ptr.getlink();
        }
        new_Node.setlink(ptr.link);
        ptr.link = new_Node;

        size++ ;
    }
    /*  Method to insert an node after given position */
    public void insertAfterPos(int d, int afterpos){

        Node new_Node=new Node(d, null);
        Node ptr = head;
        for(int i=0; i < afterpos; i++){
            ptr = ptr.getlink();
        }
        new_Node.setlink(ptr.link);
        ptr.link = new_Node;

        size++ ;
    }
    /*  Method to delete the first node */
    public void delfirst(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            System.out.println("Deleted node: " + head.getdata());
            head=head.getlink();
            size--; }
    }
    /*  Method to delete the last node */
    public void delend(){
        Node ptr = head;
        Node pptr = head;
        if (head == null){
            System.out.println("Linked List is Empty");
        }
        else{
            while(ptr.getlink()!=null){
                pptr = ptr;
                ptr=ptr.getlink();
            }
            System.out.println("Deleted node: " + ptr.getdata());
            pptr.setlink(null);
            size--;
        }

    }
    /*  Method to delete a node before given node */
    public void delBefPos(int D){
        Node ptr = head;
        Node pptr = head;
        for(int i=0; i < D-1; i++){
            pptr = ptr;
            ptr = ptr.getlink();
        }
        pptr.setlink(ptr.link);
        ptr.setlink(null);
        size--;
    }

    /*  Method to delete a node before given node */
    public void delAftPos(int E){
        Node ptr = head;
        Node pptr = head;
        for(int i=0; i < E+1; i++){
            pptr = ptr;
            ptr = ptr.getlink();
        }
        pptr.setlink(ptr.link);
        ptr.setlink(null);
        size--;
    }

    /*  Method to display nodes in linked list  */
    public void display(){
        Node ptr = head;
        System.out.print("->");
        while (ptr.getlink() != null)
        {
            System.out.print(ptr.getdata()+ "->");
            ptr = ptr.getlink();
        }
        System.out.print(ptr.getdata()+ "\n");
    }
    /*  Method to get size of linked list */
    public int getSize()
    {
        return size;
    }

}
/*  Class SinglyinkedList  */
public class Singlylinkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Singly Linked List options");
        /* Creating object of class Linked_List */
        Linked_list list=new Linked_list();
        char ch;
        /*  Perform list operations  */
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Linked List size");
            System.out.println("Enter your choice: ");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Insert options--");
                    do{
                        System.out.println("1. Insert at beginning");
                        System.out.println("2. Insert at end");
                        System.out.println("3. Insert before the Position");
                        System.out.println("4. Insert after the Position");
                        int choice1=sc.nextInt();
                        switch(choice1)
                        {
                            case 1:
                                System.out.println("Insert at Beginning");
                                System.out.println("Value: ");
                                int a=sc.nextInt();
                                list.insertAtstart(a);
                                list.display();
                                break;
                            case 2:
                                System.out.println("Insert at End");
                                System.out.println("Value: ");
                                int b=sc.nextInt();
                                list.insertAtend(b);
                                list.display();
                                break;
                            case 3:
                                System.out.println("3. Insert before the Position");
                                System.out.println("Position: ");
                                int beforepos=sc.nextInt();
                                System.out.println("value: ");
                                int c = sc.nextInt();
                                list.insertBeforePos(c, beforepos);
                                list.display();
                                break;
                            case 4:
                                System.out.println("4. Insert after the Position");
                                System.out.println("Position: ");
                                int afterpos=sc.nextInt();
                                System.out.println("value: ");
                                int d = sc.nextInt();
                                list.insertAfterPos(d, afterpos);
                                list.display();
                                break;
                        }
                        System.out.println("Do you want to continue insert options: ");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 2:
                    System.out.println("Delete options--");
                    do{
                        System.out.println("1. Delete at Beginning");
                        System.out.println("2. Delete at End");
                        System.out.println("3. Delete at before position");
                        System.out.println("4. Delete at after position");
                        int choice2=sc.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("Delete at Beginnig");
                                list.delfirst();
                                list.display();
                                break;
                            case 2:
                                System.out.println("Delete at End");
                                list.delend();
                                list.display();
                                break;
                            case 3:
                                System.out.println("Delete before a given node");
                                System.out.println("Position: ");
                                int D = sc.nextInt();
                                list.delBefPos(D);
                                list.display();
                                break;
                            case 4:
                                System.out.println("Delete after a given node");
                                System.out.println("Position: ");
                                int E = sc.nextInt();
                                list.delAftPos(E);
                                list.display();
                                break;

                        }
                        System.out.println("Do you want to continue delete options");
                        ch=sc.next().charAt(0);
                    }
                    while(ch == 'y'||ch =='Y');
                    break;
                case 3:
                    System.out.println("Your linked list is");
                    list.display();
                    break;
                case 4 :
                    System.out.println("Size of Linked List is= "+ list.getSize() +" \n");
                    break;
            }
            list.display();
            System.out.println("Do you want to continue main menu: ");
            ch=sc.next().charAt(0);
        }
        while(ch == 'y'||ch =='Y');
    }

}
