import java.util.*;
class NodeBST{
    int data;
    NodeBST left,right ;

    void setdata(int val){
        data=val;
    }
    int getdata(){
        return  data;
    }
    void setleft(NodeBST a){
        left=a;
    }
    NodeBST getleft(){
        return left;
    }
    void setright(NodeBST b){
        right=b;
    }
    NodeBST getright(){
        return right;
    }
}

class Bst {

    public NodeBST createNewNode(int v){
        NodeBST a = new NodeBST();
        a.setdata(v);
        a.setleft(null);
        a.setright(null);
        return a;
    }

    public NodeBST insert(NodeBST n,int val){
        if(n == null){
            return createNewNode(val);
        }
        if (val < n.getdata()){
            n.setleft(insert(n.getleft(), val));
        } else if (val > n.getdata()){
            n.setright(insert(n.getright(), val));
        }
        return n;
    }

    public NodeBST delete(NodeBST n, int val){
        if (n == null){
            return null;
        }
        if(val < n.getdata()){
            n.setleft(delete(n.getleft(), val));
        } else if (val > n.getdata()){
            n.setright(delete(n.getright(), val));
        }else {
            if (n.getleft() == null || n.getright() == null){
                NodeBST temp = null;
                if (n.getleft()==null){
                    temp = n.getright();
                }else{
                    temp =  n.getleft();
                }
                if (temp == null){
                    return null;
                }else{
                    return temp;
                }
            }else{
                NodeBST successor = Getsuccessor(n);
                n.data = successor.getdata();
                n.right = delete(n.right, 4);
                return n;

            }
        }
        return n;
    }

    public NodeBST Getsuccessor(NodeBST node){
        if (node == null){
            return null;
        }
        NodeBST temp = node.getright();
        while (temp.getleft() != null){
            temp = temp.getleft();
        }return temp;
    }



    int sum =0;
    public void inorder(NodeBST r){
        if(r != null)
        { inorder(r.getleft());

            System.out.print(r.getdata()+" ");

            inorder(r.getright());}
    }

    public void preorder(NodeBST r){
        if(r != null){
            System.out.print(r.getdata()+" ");
            preorder(r.getleft());
            preorder(r.getright());}
    }

    public void postorder(NodeBST r){
        if(r != null)
        {
            postorder(r.getleft());
            postorder(r.getright());
            System.out.print(r.getdata() +" ");}

    }
}

public class BSTMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        Bst bt = new Bst();
        NodeBST root = null;


        do{
            System.out.println("1.Insertion \n"+"2.Deletion \n"+"3.Inorder \n"+"4.preorder \n"+"5.postorder \n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Insertion \nInput a no.");
                    int val = sc.nextInt();
                    root = bt.insert(root, val);
                    break;
                case 2:
                    System.out.println("Deletion \nEnter a no you want Delete:");
                    int del = sc.nextInt();
                    bt.delete(root, del);
                    break;
                case 3:
                    bt.inorder(root);
                    break;
                case 4:
                    bt.preorder(root);
                    break;
                case 5:
                    bt.postorder(root);
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }

            System.out.print("\n inorder :");
            bt.inorder(root);
            System.out.print("\n preorder :");
            bt.preorder(root);
            System.out.print("\n postorder :");
            bt.postorder(root);
            System.out.println("\n do you want to perform any operation(y/n)");
            ch= sc.next().charAt(0);
        }
        while(ch == 'y' || ch == 'Y');
    }
}
