// Sample Input

// 6
// 3
// 5
// 4
// 7
// 2
// 1
// Sample Output

// 3 2 5 1 4 7 
import java.io.*;
import java.util.*;
class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

//Main function which performs level order traversal
class BSTLevelOrderTraversal {

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue < Node > queue = new LinkedList < Node > ();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
