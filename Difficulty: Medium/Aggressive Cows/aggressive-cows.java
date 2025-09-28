class Solution {
    public static boolean isvalid(int[] arr , int mid , int k){
        int prevcount = arr[0];
        int count = 1;
       int i = 1;
       while(i < arr.length){
           if(arr[i] -  prevcount >= mid){
               count++;
               prevcount = arr[i];
           }
          
           i++;
       }
        return count >= k;
    }
    public int aggressiveCows(int[] stalls, int k) {
       int st = 1;
       int end = Arrays.stream(stalls).max().getAsInt();
       int ans = 0;
       Arrays.sort(stalls);
       while(st <=  end){
           int  mid =  st + (end-st)/2;
           if(isvalid(stalls, mid , k)){
               ans =  mid;
               st = mid + 1;
           }
           else  end = mid - 1;
       }
       return ans;
    }
}