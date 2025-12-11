class Solution {
    public static void insert(Stack<Integer> st , int val){
        if(st.size() == 0 || st.peek() <= val){
            st.push(val);
            return;
        }
        int maal =  st.pop();
        insert(st , val);
        st.push(maal);
    }
    public void sortStack(Stack<Integer> st) {
        
        if(st.size() == 1){
            return;
        }
        int val =  st.pop();
        sortStack(st);
        insert(st , val);
        
    }
}