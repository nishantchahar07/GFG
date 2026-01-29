// User function Template for Java//User function Template for Java
class Solution {
    
    public void get(int[] arr, int i , ArrayList<Integer> ll , int sum  ){
        if(i ==  arr.length ){
            ll.add(sum);
            return;
        }
        
          get(arr , i+1 , ll , sum);
          sum+=arr[i];
          get(arr , i+1, ll , sum);
          sum-=arr[i];

    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ll = new ArrayList<>();
        get(arr , 0 , ll , 0);
        return ll ;
    } 
}