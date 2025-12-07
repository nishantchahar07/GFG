class Solution {
    public void nearlySorted(int[] arr, int k) {
        
        PriorityQueue<Integer> pq =  new PriorityQueue<>();
        for(int  i = 0 ; i < arr.length ;i++){
            pq.add(arr[i]);
        }
        int i = 0;
        while(pq.size() > 0){
            arr[i++] = pq.poll();
        }
        
    }
}
