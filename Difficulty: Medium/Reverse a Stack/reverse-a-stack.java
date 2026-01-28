class Solution {
    public static void insertAtBottom(Stack<Integer> st , int val){
        if(st.isEmpty()){
            st.push(val);
            return ;
            
        }
        int temp =  st.pop() ;
        insertAtBottom(st ,  val);
        st.push(temp);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        
        int val =  st.pop();
        reverse(st);
        insertAtBottom(st ,  val);
    } 
    
    public static void reverseStack(Stack<Integer> st) {
       reverse(st);
    }
}
