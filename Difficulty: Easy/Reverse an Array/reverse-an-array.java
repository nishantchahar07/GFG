class Solution {
    public void reverseArray(int arr[]) {
        Stack<Integer>  st =  new Stack<Integer>();
        int i = 0;
        while(i < arr.length){
            st.push(arr[i]);
            i++;
        }
        i = 0;
        while(!st.isEmpty()){
            arr[i++] = st.pop();
        }
       
    }
}