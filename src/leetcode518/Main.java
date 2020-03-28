package leetcode518;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		
		int amount = 5;
		
		System.out.println("Coins: " + Arrays.toString(coins));
		
		System.out.println("Amount: " + amount);
		
		FindTotalCombinationFunction solution = new FindTotalCombinationFunction();
		
		System.out.println("Solution: " + solution.change(amount, coins));
	}
}
