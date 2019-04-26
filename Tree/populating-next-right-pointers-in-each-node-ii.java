/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution
{
    public Node connect(Node root)
    {
        Node head = root;
        while(root != null){
            Node currentNode = root;
            while(currentNode != null){
                if(currentNode.left != null && currentNode.right != null){
                    currentNode.left.next = currentNode.right;
                    currentNode.right.next = getNextNode(currentNode.next);
                }
                else if(currentNode.left != null || currentNode.right != null){
                    getNextNode(currentNode).next = getNextNode(currentNode.next);
                }
                currentNode = currentNode.next;
            }
            root = getNextNode(root);
        }
        return head;
    }
    public Node getNextNode(Node root){
        if(root == null) return null;
        else if(root.left != null) return root.left;
        else if(root.right != null) return root.right;
        else return getNextNode(root.next);
    }
}