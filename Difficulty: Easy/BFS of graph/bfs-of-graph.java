class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
       Queue<Integer> q =  new LinkedList<>();
       boolean visited[] = new boolean[adj.size()];
       ArrayList<Integer> ll =  new ArrayList<Integer>();
       
       q.add(0);
       
       while(!q.isEmpty()){
           int val =  q.poll();
           if(visited[val])continue;
           ll.add(val);
           visited[val] = true;
           
           for(int nbrs  : adj.get(val)){
               q.add(nbrs);
               
           }
       }
       return ll;
        
    }
}