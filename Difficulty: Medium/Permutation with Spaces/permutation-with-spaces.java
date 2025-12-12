class Solution {
    void solve(String s, int i, String ans, ArrayList<String> res) {
     
        if (i == s.length()) {
            res.add(ans);
            return;
        }

        char ch = s.charAt(i);

        solve(s, i + 1, ans + ch, res);

        if (i != 0)
            solve(s, i + 1, ans + " " + ch, res);
    }

    ArrayList<String> permutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        solve(s, 0, "", res);
        Collections.sort(res);
        return res;
    }
}
