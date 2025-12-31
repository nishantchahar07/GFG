class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
      Queue<Integer> q  =  new LinkedList<>();
      int size =  adj.size();
      boolean []visited =  new boolean[size];
      ArrayList<Integer> ans  =  new ArrayList<>();
      
      q.add(0);
      visited[0] =  true;
       while(!q.isEmpty()){
           int val =  q.poll();
           visited[val] = true;
           
           
           ans.add(val);
           
           //unvisited nbrs 
           
           for(int x : adj.get(val) ){
               if(!visited[x]){
                   visited[x] = true;
                   q.add(x);
               }
               
               
           }
       }
       return ans;
        
        
        
        
    }
}