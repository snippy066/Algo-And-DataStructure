//package DS.queue;
//height of binary tree using queue

public class heightOfbin {
    public static void main(String ar[]){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.print("The height of the binary tree is " + height(root));
    }
}
