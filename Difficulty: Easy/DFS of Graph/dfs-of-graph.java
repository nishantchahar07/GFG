class Solution {

    public void getdfs(ArrayList<ArrayList<Integer>> adj,
                       ArrayList<Integer> result,
                       HashSet<Integer> set,
                       int i) {

        if (set.contains(i)) return;

        set.add(i);          // visited
        result.add(i);       

        for (int j = 0; j < adj.get(i).size(); j++) {
            int nbr = adj.get(i).get(j);   
            if (!set.contains(nbr)) {
                getdfs(adj, result, set, nbr);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();

        getdfs(adj, result, st, 0);  

        return result;
    }
}
