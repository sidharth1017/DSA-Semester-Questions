import java.util.*;

public class DFS{
    Stack<Node> S=new Stack<>();
    static class Node{
        int data;
        ArrayList<Node> neighbour=new ArrayList<>();
        boolean visit;
        public Node(int v){
            data=v;
        }
        public void addneighbour(Node n){
            neighbour.add(n);
        }
        public ArrayList<Node> getneighbour(Node n){
            return n.neighbour;
        }
        public void printneighbour(Node n){
            ArrayList<Node> nn =getneighbour(n);
            for(int i=0;i<nn.size();i++){
                Node node=nn.get(i);
                System.out.print(node.data+" ");
            }
        }
    }
    void dfs(Node n){
        S.add(n);//add
        while(!S.isEmpty()) {
            Node ex = S.pop();//remove
            System.out.print(ex.data+", ");//print
            ArrayList<Node> E = ex.getneighbour(ex);//getting nei and adding to queue
            for(int i=0;i<E.size();i++) {
                Node N=E.get(i);
                if(N!=null && N.visit==false) {//important condn
                    S.add(N);
                }
                N.visit=true;
            }
        }System.out.println("\n");
    }
    public static void main(String[] args){
        DFS bf = new DFS();
        Node node40=new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node50=new Node(50);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node70=new Node(70);

        node40.addneighbour(node20);
        node40.addneighbour(node10);
        node10.addneighbour(node30);
        node20.addneighbour(node50);
        node20.addneighbour(node60);
        node20.addneighbour(node30);
        node20.addneighbour(node10);
        node30.addneighbour(node60);
        node50.addneighbour(node70);
        node60.addneighbour(node70);
        System.out.println("The DFS traversal of the graph is ");
        DFS bf1=new DFS();
        System.out.println();
        bf.dfs(node40);
    }}
