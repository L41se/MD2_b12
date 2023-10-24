package Demo_my_tree;

public class Node {
    public Integer data;
    public Node Left;
    public Node Right;

    public Node(Integer value) {
    }

    public void node(Integer data){
        this.data = data;
        this.Left = null;
        this.Right = null;
    }
   
}
