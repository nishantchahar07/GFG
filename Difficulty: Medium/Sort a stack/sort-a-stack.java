class Solution {
    public void insert(Stack<Integer> st , int val){
        if(st.isEmpty() || st.peek() <= val){
            st.push(val);
            return;
        }
        
        int temp = st.pop();
        insert(st , val);
        st.push(temp);
    }
    public void sort(Stack<Integer> st){
        if(st.isEmpty())return;
        int val =  st.pop();
        sort(st);
        insert(st , val);
        
    }
    public void sortStack(Stack<Integer> st) {
       sort(st);
        
    }
}