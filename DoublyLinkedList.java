import java.util.Scanner;

/*  Class Node  */
class Noded {
    int data;
    Noded prev;
    Noded next;

    /* Parameterize Constructor  */
    public Noded(int d){
        prev=null;
        data=d;
        next=null;
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
    public void setnext(Noded n){
        next=n;
    }
    /*  Method to get link to next node  */
    public Noded getnext(){
        return next;
    }    /*  Method to set link to next Node  */
    public void setprev(Noded m){
        prev=m;
    }
    /*  Method to get link to next node  */
    public Noded getprev(){
        return prev;
    }

}

/* Class Linked_List */
class Doubly_Linked_lists
{
    public Noded head;
    public int size;

    /*  Constructor  */
    public Doubly_Linked_lists(){
        size =0;
    }

    /*  Method to insert an node at beginning  */
    public void insertAtstart(int a){
        Noded new_node = new Noded(a);

        if (head==null){
            new_node.setprev(null);
            new_node.setnext(head);
            head=new_node;
            size++ ;
        }
        else {
            new_node.setprev(null);
            new_node.setnext(head);
            head.setprev(new_node);
            head = new_node;
            size++;
        }
    }

    /*  Method to insert an node at the end */
    public void insertAtend(int b){
        Noded new_Node=new Noded(b);
        Noded ptr = head;
        while(ptr.getnext()!=null){
            ptr = ptr.getnext();
        }
        ptr.setnext(new_Node);
        new_Node.setprev(ptr);
        size++ ;
    }
    /*  Method to insert an node before given position */
    public void insertBeforePos(int c, int beforenode){
        Noded new_Node=new Noded(c);
        Noded ptr = head;
        while(ptr.getdata() != beforenode){
            ptr = ptr.getnext();
        }
        new_Node.setprev(ptr.prev);
        new_Node.setnext(ptr);
        ptr.prev.next = new_Node;
        ptr.prev = new_Node;
        size++ ;
    }
    /*  Method to insert an node after given position */
    public void insertAfterPos(int d, int afternode){
        Noded new_Node=new Noded(d);
        Noded ptr = head;
        while(ptr.getdata() != afternode){
            ptr = ptr.getnext();
        }
        new_Node.setprev(ptr);
        new_Node.setnext(ptr.next);
        ptr.next = new_Node;
        ptr.prev = new_Node;
        size++ ;
    }
    /*  Method to delete the first node */
    public void delfirst(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Noded ptr = head;
            head=head.getnext();
            ptr.setnext(null);
            head.setprev(null);
            size--; }
    }
    /*  Method to delete the last node */
    public void delend(){
        if (head == null){
            System.out.println("Linked List is Empty");
        }
        else{
            Noded ptr = head;
            while (ptr.getnext() != null){
                ptr = ptr.getnext();
            }
            ptr.prev.next = null;
            ptr.prev = null;
            size--;
        }

    }
    public void delBefPos(int D){
        Noded ptr = head;
        while(ptr.getdata() != D){
            ptr = ptr.getnext();
        }
        ptr.prev = ptr.prev.prev;
        ptr.prev.next = ptr;
        size--;
    }

    /*  Method to delete a node before given node */
    public void delAftPos(int E){
        Noded ptr = head;
        while(ptr.getdata() != E){
            ptr = ptr.getnext();
        }
        ptr.next = ptr.next.next;
        ptr.next.prev = ptr;
        size--;
    }
    /*  Method to display nodes in linked list  */
    public void display(){
        Noded ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.getdata()+ "->");
            ptr = ptr.getnext();
        }
        System.out.print("\n");
    }
    /*  Method to get size of linked list */
    public int getSize()
    {
        return size;
    }

}
/*  Class CircularSinglyLL  */
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Doubly Linked List options");
        /* Creating object of class Linked_List */
        Doubly_Linked_lists list = new Doubly_Linked_lists();
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
                        System.out.println("3. Insert before the Node");
                        System.out.println("4. Insert after the Node");
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
                                System.out.println("3. Insert before the Node");
                                System.out.println("Search Value: ");
                                int beforepos=sc.nextInt();
                                System.out.println("value: ");
                                int c = sc.nextInt();
                                list.insertBeforePos(c, beforepos);
                                list.display();
                                break;
                            case 4:
                                System.out.println("4. Insert after the Node");
                                System.out.println("Search Value: ");
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
                        System.out.println("3. Delete at before Node");
                        System.out.println("4. Delete at after Node");
                        int choice2=sc.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                System.out.println("1. Delete at Beginnig");
                                list.delfirst();
                                list.display();
                                break;
                            case 2:
                                System.out.println("2. Delete at End");
                                list.delend();
                                list.display();
                                break;
                            case 3:
                                System.out.println("3. Delete before the Node");
                                System.out.println("Data: ");
                                int D = sc.nextInt();
                                list.delBefPos(D);
                                list.display();
                                break;
                            case 4:
                                System.out.println("4. Delete after the Node");
                                System.out.println("Data: ");
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
                    System.out.println("Your Doubly linked list is");
                    list.display();
                    break;
                case 4 :
                    System.out.println("Size of Doubly Linked List is= "+ list.getSize() +" \n");
                    break;
            }
            list.display();
            System.out.println("Do you want to continue main menu: ");
            ch=sc.next().charAt(0);
        }
        while(ch == 'y'||ch =='Y');
    }

}
