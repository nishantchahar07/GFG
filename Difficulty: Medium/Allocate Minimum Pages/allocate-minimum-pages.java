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
            if(count > k)return false;
            i++;
           
        }
        return true;
        
    }
    public int findPages(int[] arr, int k) {
       int st = Arrays.stream(arr).max().getAsInt() ;
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++){
            end+=arr[i];
            
        }
        if(arr.length  < k)return -1;
        int ans = -1;
        
        while(st <= end){
            int mid = st+(end -st)/2;
            if(isvalid(arr , mid , k)){
                ans = mid;
                end =  mid-1;
            }
            else st = mid+1;
        }
        return ans;
        
    }
}