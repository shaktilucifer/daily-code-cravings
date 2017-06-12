	static void levelOrder(Node root){
        if(root == null){
            return;        
        } 
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
