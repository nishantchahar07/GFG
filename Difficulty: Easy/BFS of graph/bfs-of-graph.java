class Solution {
    public void getbfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited , Queue<Integer> q , int i , ArrayList<Integer> ll){
        if(visited[i])return;
        
        q.add(i);
        visited[i] =  true;
      
        while(!q.isEmpty()){
            int val =  q.poll();
          
            ll.add(val);
           
            
            for(int j = 0 ;  j < adj.get(val).size() ; j++ ){
                int nbrs =  adj.get(val).get(j);
                if(!visited[nbrs]){
                    q.add(nbrs);
                     visited[nbrs] =  true;
                    
                }
            }
        }
        
        
        
        
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n =  adj.size(); 
        
        Queue<Integer> q =  new LinkedList<>();
        boolean[] visited =  new boolean[n];
        ArrayList<Integer> ll =  new ArrayList<>();
        for(int i = 0 ; i<  n ; i++){
            getbfs(adj , visited ,  q , i , ll);
        }
        return ll;
        
        
        
    }
}