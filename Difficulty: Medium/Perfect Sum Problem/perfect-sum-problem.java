class Solution {
    public int get(int[] nums, int target, int i, int[][] dp) {

        if (i == nums.length) {
            return (target == 0) ? 1 : 0;
        }

        if (target < 0) return 0;

        if (dp[target][i] != -1) return dp[target][i];

        int add = get(nums, target - nums[i], i + 1, dp);
        int not = get(nums, target, i + 1, dp);

        return dp[target][i] = add + not;
    }

    public int perfectSum(int[] nums, int target) {
        int[][] dp = new int[target + 1][nums.length];
        for (int[] row : dp) Arrays.fill(row, -1);
        return get(nums, target, 0, dp);
    }
}
