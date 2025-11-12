/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    int curr = -1;
    public ArrayList<Integer> leftView(Node root) {
      ArrayList<Integer> ll =  new ArrayList<>();
    //   int curr = -1;
      get(root ,  0 ,  ll );
      return ll;
      
    }
    public void get(Node root , int mh , List<Integer> ll  ){
     
     if(root == null)return;
     if(curr <  mh){
         ll.add(root.data);
         curr =  mh;
     }
     get(root.left, mh+1 , ll );
     get(root.right , mh+1 , ll );
     
    }
}