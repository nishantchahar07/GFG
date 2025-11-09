/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
    Node prev =  null;
    Node curr =  head;
    while(curr !=  null){
        Node temp =  curr.next;
        curr.next =  prev;
        prev =  curr;
         curr =  temp;
         
    }
    // now prev -->  reversed ll ka head
    Node temp  = prev;
    int carry = 1;
    Node last =  null;
    while(temp != null){
        int sum =  temp.data + carry;
        temp.data =  sum % 10;
        carry =  sum/10;
        last =  temp;
        temp =  temp.next;
        
    }
    if(carry != 0){
        last.next = new Node(carry);
    }
    Node next =  null;
    curr =  prev;
    
    while(curr !=  null){
        Node sys =  curr.next;
        curr.next =  next;
        next =  curr;
         curr =  sys;
         
    }
    return next;
    
    
       
    }
}