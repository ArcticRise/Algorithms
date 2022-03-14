package LeetCode;

public class BurstBalloons {
    public static void main(String[] args){
        int[] nums1 = {3,1,5,8};
        // [3,1,5,8] -> [3,5,8] -> [3,8] -> 8
        // 3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 = 167
        System.out.println(maxCoins(nums1));

    }

    public static int maxCoins(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; ++i){
            int left = i == 0 ? 1 : nums[i-1];
            int right = i == n-1? 1 : nums[i+1];
            dp[i][i] = nums[i] * left * right;
        }

        for(int j = 1; j < n; ++j){
            int i = 0;
            for(int k = j; k < n; ++k){
                int left = i == 0 ? 1 : nums[i-1];
                int right = k == n-1? 1 : nums[k+1];
                dp[i][k] = Math.max(dp[i+1][k] + (nums[i] * left * right), dp[i][k-1] + (nums[k] * left * right));

                for(int l = i + 1; l < k; ++l){
                    int current = dp[i][l-1] + dp[l+1][k];
                    dp[i][k] = Math.max(dp[i][k], nums[l]*left*right + current);
                }
                ++i;
            }
        }
        return dp[0][n-1];
    }
}
