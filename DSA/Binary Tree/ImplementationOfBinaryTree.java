import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

class Pair{
    Node node;
    int level;
    Pair(Node node ,int level){
        this.level = level;
        this.node = node;
    }
}


public class ImplementationOfBinaryTree {

    public static int size(Node root){
        if(root==null) return 0;
        int leftSize =  size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize; 
    // return (root==null) ? 0 : (1+size(root.left) + size(root.right));
    }

    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left); //left ki saari values print kr dega ye
        display(root.right);//right ki saari values print kr dega ye
        }

         public static void PreOrderDisplay(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        PreOrderDisplay(root.left); //left ki saari values print kr dega ye
        PreOrderDisplay(root.right);//right ki saari values print kr dega ye

        }

         public static void InOrderDisplay(Node root) {
        if(root == null) return;
        InOrderDisplay(root.left); //left ki saari values print kr dega ye
        System.out.print(root.val+" ");
        InOrderDisplay(root.right);//right ki saari values print kr dega ye

        }

         public static void PostOrderDisplay(Node root) {
        if(root == null) return;
        PostOrderDisplay(root.left); //left ki saari values print kr dega ye
        PostOrderDisplay(root.right);//right ki saari values print kr dega ye
        System.out.print(root.val+" ");
        
        }



        public static int sum(Node root) {
            if(root==null) return 0;
           int sum = root.val + sum(root.left) + sum(root.right);
            return sum; 
        }



        public static int product(Node root) {
            if(root == null) return 1;
            if(root.val == 0) {
                return product(root.left) * product(root.right);
                }

                return root.val * product(root.left) * product(root.right);
        }


         public static int max(Node root) {
            if(root == null) return Integer.MIN_VALUE;
            return Math.max(root.val,Math.max(max(root.left),max(root.right)));
        }



        public static int level(Node root){
        //     if(root==null) return 0;
        //    int level1 = 1  +   level(root.left);
        //    int level2 = 1  +   level(root.right);
        //    int level = Math.max(level1, level2);
        //    return level;
            return (root==null) ? 0 : 1+(Math.max(level(root.left),level(root.right)));
        }

        public static void LevelOrderTraversal(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(q.size()>0){
                Node front = q.remove();
                System.out.print(front.val+" ");
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            System.out.println();
        } 


        public static void LevelOrderPrint(Node root){
            Queue<Pair> q = new LinkedList<>();
            int currLevel = 0;
            q.add(new Pair(root,0));
            while(q.size()>0){
                Pair front = q.remove();
                if(front.level != currLevel){
                    currLevel++;
                    System.out.println();
                }
                System.out.print(front.node.val+" ");
                if(front.node.left != null) q.add(new Pair(front.node.left,front.level+1));
                if(front.node.right != null) q.add(new Pair(front.node.right,front.level+1));
            }
            System.out.println();
        } 

        public static void kThLevel(Node root,int level, int k ){
            if(root == null) return;
            if(level == k) System.out.print(root.val+" ");
            kThLevel(root.left,level+1,k);
            kThLevel(root.right,level+1,k);
        }

    public static void main(String[] args) {
    //          3
    //        /   \
    //       4     2
    //      / \   / \
    //    -1   1 6   9
    Node a = new Node(3);//root
    Node b = new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);
    a.left = b; a.right = c;
    b.left = d; b.right = e;
    c.left = f; c.right = g;
    display(a);
    
    System.out.println();
    System.out.println("The size of Binary Tree is : "+size(a));
    System.out.println("The summation of all the node "+sum(a));
    System.out.println("The product of all the node "+product(a));
    System.out.println("The maximum value of Binary Tree "+max(a));
    System.out.println("Number of a level in a Binary Tree "+level(a));

    System.out.print("Preorder Traversal(DFS) : ");
    PreOrderDisplay(a);
    System.out.println();

    System.out.print("Inorder Traversal(DFS) : ");
    InOrderDisplay(a);
    System.out.println();
    
 
    System.out.print("Postorder Traversal(DFS) : ");
    PostOrderDisplay(a);
    System.out.println();
    
    System.out.print("Level Order Traversal(BFS) : ");
    LevelOrderTraversal(a);

    System.out.println("Print all the element in a level(BFS) : ");
    LevelOrderPrint(a);

    System.out.print("Print the kth level element : ");
    kThLevel(a,0,2);
    System.out.println();
    
    // for(int i=0;i<level(a);i++){
    //     kThLevel(a,0,i);
    //     System.out.println();
    // }
    }
}
