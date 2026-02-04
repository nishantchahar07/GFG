/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public void get(Node root , ArrayList<Integer> ll ){
    if(root == null )return;
    
     ll.add(root.data);
     get(root.left , ll);
     get(root.right , ll);
    
    
}
    
    public ArrayList<Integer> preOrder(Node root) {
       ArrayList<Integer> ll = new ArrayList<>();
       
        get(root , ll );
        return ll;
    }
}