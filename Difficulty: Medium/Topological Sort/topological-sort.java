class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // KAHN ALGO
        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        
        int[] indegree =  new int[V];
        for(int i = 0 ; i < V ; i++){
            ll.add(new ArrayList<>());
        }
        for(int i = 0  ; i < edges.length ; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            
            ll.get(a).add(b);
          indegree[b]++;
        }
        // for(int i = 0 ; i<ll.size() ; i++){
        //     // ek indegree array bna 
        //     indegree[i] =  ll.get(i).size();
        // }
        
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);

            for (int nbr : ll.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }
        
        return list;
        
    }
}