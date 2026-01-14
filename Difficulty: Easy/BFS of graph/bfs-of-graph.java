class Solution {
    public void getbfs(ArrayList<ArrayList<Integer>> adj,
                       ArrayList<Integer> ans,
                       HashSet<Integer> set,
                       int i) {
        Queue<Integer> q =  new LinkedList<>();
    
          q.add(i);
          set.add(i);
        
            
            while(!q.isEmpty()){
                int val =  q.poll();
               

                ans.add(val);
               
                
                for(int j = 0 ; j < adj.get(val).size() ; j++){
                    int nbrs =  adj.get(val).get(j);
                    if(!set.contains(nbrs)){
                        q.add(nbrs);
                         set.add(nbrs);
                    } 
                }
            }
                       }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans =  new ArrayList<>();
        
//ignore --> ignore --> visited --> selfwork --> nbrs
            getbfs(adj, ans, set, 0);  

        return ans; 
      
        
    }
}