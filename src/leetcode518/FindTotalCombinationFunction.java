package leetcode518;

public class FindTotalCombinationFunction {
	public int change(int amount, int[] coins) {
		// Edge case, no amount of money
		if (amount == 0) {
			return 1;
		}

		int[] dp = new int[amount + 1];

		// Base case: there is only one way to get 0 amount
		dp[0] = 1;

		// For each coins, we update the dp
		for (int coin : coins) {
			for (int current = coin; current <= amount; current++) {
				// current - coin will get the total amount exclude current coin
				dp[current] += dp[current - coin];
			}
		}

		return dp[amount];
	}
}
