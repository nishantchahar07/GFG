import java.util.*;
class Solution {
    public boolean isvalid(int[] arr , int mid , int k){
        int sum = 0;
        int count = 1;
        int i = 0;
        while( i < arr.length){
            sum+=arr[i];
            if(sum > mid){
            count++;
             sum =  arr[i];
            }
            i++;
            if(count > k){
                return false;
            }
        }
        return true;
        
    }
    public int minTime(int[] arr, int k) {
       int st = Arrays.stream(arr).max().getAsInt();
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            end+=arr[i];
            
        }
        int ans = 0;
        
        while(st <= end){
            int mid = st+(end -st)/2;
            if(isvalid(arr , mid , k)){
                ans = mid;
                end =  mid-1;
            }
            else st =mid+1;
        }
        return ans;
    }
}
