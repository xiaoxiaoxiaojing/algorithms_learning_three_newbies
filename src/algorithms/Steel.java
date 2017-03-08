package algorithms;

import java.util.Scanner;

public class Steel {
	public static void main(String[] args) {
		int[] price = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] profit = new int[n + 1];
		System.out.println(getMaxProfit(n, profit, price));

	}

	static int getMaxProfit(int n, int[] profit, int[] price) {
		if (n == 0) {
			return 0;
		}
		if (profit[n] > 0) {
			return profit[n];
		}

		for (int i = 1; i <= n; ++i) {
			if (i <= 10) {
				profit[i] = price[i - 1];
			}

			for (int j = 1; j <= i / 2; ++j) {

				int profitbuff = getMaxProfit(j, profit, price) + getMaxProfit(i - j, profit, price);
				if (profit[i] < profitbuff) {
					profit[i] = profitbuff;
				}

			}
		}
		return profit[n];
	}
}
