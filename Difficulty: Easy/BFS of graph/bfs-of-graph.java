class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
      //remove --> ignore --> visited --> selfwork --> nbrs
      ArrayList<Integer>  result =  new ArrayList<>();
      HashSet<Integer> visited =  new HashSet<>();
      Queue<Integer> q = new LinkedList<>();
     
        q.add(0);
        
        while(!q.isEmpty()){
            int val =  q.poll();
            if(visited.contains(val))continue;
            visited.add(val);
            result.add(val);
            
            for(int nbrs : adj.get(val)){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
            
        }
        
     
     return result;
      
        
    }
}