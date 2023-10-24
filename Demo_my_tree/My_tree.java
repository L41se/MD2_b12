package Demo_my_tree;

public class My_tree {
    public Node root;

    public My_tree(){
        this.root = null;
    }

    public void insert(Integer value){
        Node node = new Node(value);
        Node currentNode = this.root;
        Node previous = currentNode;
        if( this.root == null) {
            this.root = node;
        } else {
            while(currentNode != null){
                if (currentNode.data > value) {
                    currentNode = currentNode.Left;
                }else {
                    currentNode = currentNode.Right;
                }
            }
        }
    }
}
