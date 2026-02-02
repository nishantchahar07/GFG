class Solution {

    public void get(int cr, int cc, int n, int m, int[][] maze,
                    ArrayList<String> ll, String str) {

        if (cr < 0 || cc < 0 || cr >= n || cc >= m || maze[cr][cc] != 1)
            return;

        if (cr == n - 1 && cc == m - 1) {
            ll.add(str);
            return;
        }

        maze[cr][cc] = -1; 

        int[][] dir = {{1,0},{0,-1},{0,1},{-1,0}};
        char[] ans = {'D','L','R','U'};

        for (int i = 0; i < 4; i++) {
            get(cr + dir[i][0], cc + dir[i][1], n, m, maze, ll, str + ans[i]);
        }

        maze[cr][cc] = 1; 
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length, m = maze[0].length;
        ArrayList<String> ll = new ArrayList<>();

        if (maze[0][0] == 1)
            get(0, 0, n, m, maze, ll, "");

        return ll;
    }
}
