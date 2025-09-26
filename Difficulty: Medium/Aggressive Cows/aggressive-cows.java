class Solution {
   public static boolean isvalid(int[] arr, int cow, int mid) {
    int count = 1;
    int lastPos = arr[0]; 

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] - lastPos >= mid) {
            count++;
            lastPos = arr[i];
        }
        if (count >= cow) return true; 
    }

    return false;
}

    public int aggressiveCows(int[] stalls, int k) {
        int lo = 0;
        int hi = Arrays.stream(stalls).max().getAsInt();
        int ans = 0;
        Arrays.sort(stalls);
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(isvalid(stalls , k , mid)){
             ans = mid;
            lo = mid+1;
        }
        else{
            hi = mid-1;
        }
        
    }
     return ans; 
}
}