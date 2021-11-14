import java.util.*;
class NodeBT{
    protected int data;
    protected NodeBT left,right ;
    public NodeBT(){
        data =0;
        left = null;
        right= null;
    }
    public NodeBT(int n){
        data =n;
        left = null;
        right = null;
    }
    void setdata(int val){
        data=val;
    }
    int getdata(){
        return  data;
    }
    void setleft(NodeBT a){
        left=a;
    }
    NodeBT getleft(){
        return left;
    }
    void setright(NodeBT b){
        right=b;
    }
    NodeBT getright(){
        return right;
    }
}

class Bt {
    int c = 0;
    NodeBT root = null;

    public void insert(int v){
        c=c+1;
        root=insert(root,v);
    }
    public NodeBT insert(NodeBT n,int val){
        if(n == null){
            n= new NodeBT(val);
        }
        else if(n.left == null){
            n.left=insert(n.left,val);
        }
        else if(n.right == null)
            n.right=insert(n.right,val);
        else
            n.left=insert(n.left,val);
        return n;
    }

    int sum =0;
    public void inorder(NodeBT r){
        if(r != null)
        { inorder(r.getleft());

            System.out.print(r.getdata()+" ");

            inorder(r.getright());}
    }

    public void preorder(NodeBT r){
        if(r != null){
            System.out.print(r.getdata()+" ");
            preorder(r.getleft());
            preorder(r.getright());}
    }

    public void postorder(NodeBT r){
        if(r != null)
        {
            postorder(r.getleft());
            postorder(r.getright());
            System.out.print(r.getdata() +" ");}

    }

    /* Function to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(NodeBT r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getleft());
            l += countNodes(r.getright());
            return l;
        }
    }

    /* Function to search for an element */
    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(NodeBT r, int val)
    {
        if (r.getdata() == val)
            return true;
        if (r.getleft() != null)
            if (search(r.getleft(), val))
                return true;
        if (r.getright() != null)
            if (search(r.getright(), val))
                return true;
        return false;
    }

}

public class Binarytree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        Bt bt = new Bt();

        // To store the sum at every level

        do{
            System.out.println("1.Insertion  \n"+"2.Inorder \n"+"3.preorder \n"+"4.postorder \n"+"5.Search no. \n" +"6.Total nodes \n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Insertion \n input a no.");
                    int k1=sc.nextInt();
                    bt.insert(k1);
                    break;
                case 2:
                    bt.inorder(bt.root);
                    break;
                case 3:
                    bt.preorder(bt.root);
                    break;
                case 4:
                    bt.postorder(bt.root);
                    break;
                case 5 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bt.search( sc.nextInt() ));
                    break;
                case 6 :
                    System.out.println("Nodes = "+ bt.countNodes());


                default:
                    System.out.println("invalid input");
                    break;
            }
            System.out.print("\n inorder :");
            bt.inorder(bt.root);
            System.out.print("\n preorder :");
            bt.preorder(bt.root);
            System.out.print("\n postorder :");
            bt.postorder(bt.root);
            System.out.println("\n no. of nodes : "+bt.c);
            System.out.println("\n do you want to perform any operation(y/n)");
            ch= sc.next().charAt(0);
        }
        while(ch == 'y' || ch == 'Y');
    }
}