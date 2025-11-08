/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
       Node fast = head;
       Node slow = head;
       
       int count = 1;
       while(fast != null && fast.next!= null){
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast){
               slow = slow.next;
               while(slow != fast){
                   slow = slow.next;
                   count++;
               }
                          return count;
        

               
           }
           }
           return 0;
    }
}