class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
           ArrayList<Integer>  ll =  new ArrayList<>();
           Stack<Integer>  st = new Stack<>();
           boolean visited[] =  new boolean[adj.size()];
          
          st.push(0);
          while(!st.isEmpty()){
              int val =  st.pop();
              
              if(visited[val])continue;
              ll.add(val);
              visited[val] = true;
              ArrayList<Integer>  BD =  new ArrayList<>();
              BD = adj.get(val);
               Collections.reverse(BD);
              
              for(int nbrs :BD){
                  if(!visited[nbrs]){
                      st.push(nbrs);
                  }
              }
          }
          return ll;
        
    }
}