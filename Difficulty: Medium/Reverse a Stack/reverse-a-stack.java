class Solution {
   public static  void insertbottom(Stack<Integer> st , int val){
       if(st.size() == 0){
          st.push(val);
          return;
       } 
       int maal =  st.pop();
       insertbottom(st , val);
       st.push(maal );
    }
    public static void reverseStack(Stack<Integer> st) {
        
        if(st.size() == 0)return;
        int val  =  st.pop();
        reverseStack(st);
        insertbottom(st , val);
        
        
    }
}
