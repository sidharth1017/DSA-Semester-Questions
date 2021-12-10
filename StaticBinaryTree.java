import java.util.Scanner;
/* Class BTNode1 */
class BTNode1
{
    public BTNode1 left, right;
    char data;
    /* Constructor */
    public BTNode1(char n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void SetLeft(BTNode1 n)
    {
        left = n;
    }
    /* Function to set right node */
    public void SetRight(BTNode1 n)
    {
        right = n;
    }
    /* Function to get left node */
    public BTNode1 getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BTNode1 getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(char d)
    {
        data = d;
    }
    /* Function to get data from node */
    public char getData()
    {
        return data;
    }

    public int countNodes(BTNode1 r)
    {
        if (r == null)
            return 0;
        else
        {
            int C = 1;
            C += countNodes(r.getLeft());
            C += countNodes(r.getRight());
            return C;
        }
    }

    public boolean search(BTNode1 r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }
    /* Function for inorder traversal */
    public void inorder(BTNode1 r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder(BTNode1 r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder(BTNode1 r)
    { if (r != null)
    {
        postorder(r.getLeft());
        postorder(r.getRight());
        System.out.print(r.getData() +" ");
    }
    }
}

/* Class BinaryTree */
public class StaticBinaryTree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BTNode1 root = Binarytree();

        System.out.print("\nPost order : ");
        root.postorder(root);
        System.out.print("\nPre order : ");
        root.preorder(root);
        System.out.print("\nIn order : ");
        root.inorder(root);
        System.out.print("\n");
        System.out.println("Nodes = "+ root.countNodes(root));
        System.out.print("\n");
    }
    public  static BTNode1 Binarytree()
    { BTNode1 root = new BTNode1('A');
        BTNode1 nodeB = new BTNode1('B');
        BTNode1 nodeC = new BTNode1('C');
        BTNode1 nodeD = new BTNode1('D');
        BTNode1 nodeE = new BTNode1('E');
        BTNode1 nodeF = new BTNode1('F');
        BTNode1 nodeG = new BTNode1('G');
        root.SetLeft(nodeB);
        root.SetRight(nodeC);
        nodeB.SetLeft(nodeD);
        nodeB.SetRight(nodeE);
        nodeC.SetRight(nodeF);
        nodeF.SetLeft(nodeG);
        return root;
    }

}