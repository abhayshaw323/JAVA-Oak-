class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }

}
    public class Mirror_Tree {
   public static void mirror(Node root){
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    
    // This will also run
    
    // mirror(root.left);
    // mirror(root.right);
    // Node temp = root.left;
    // root.left = root.right;
    // root.right = temp;
    
    // This code will also run
    // SPECIAL CASE
    // mirror(root.left); -> you can change left to right then also it will run
    // Node temp = root.left;
    // root.left = root.right;
    // root.right = temp;
    // mirror(root.left); -> you can change left to right then also it will run
    
    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        display(root.left); //left ki saari values print kr dega ye
        display(root.right);//right ki saari values print kr dega ye
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
    mirror(a);
    System.out.println();
    display(a);
    
    }
}
