package algorithms;

public class InsertRank {

	public static void main(String[] args) {
		double[] nums = { 1, -3, 4, 2 };
		for (double num : nums) {
			System.out.print(num + ", ");
		}
		System.out.println();
		insertRank(nums);
		for (double num : nums) {
			System.out.print(num + ", ");
		}
	}

	static void insertRank(double[] nums) {
		double keyNum = 0;
		for (int i = 1; i < nums.length; ++i) {
			keyNum = nums[i];
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] <= keyNum) {
					nums[j + 1] = keyNum;
					break;
				}
				nums[j + 1] = nums[j];
				if (j == 0) {
					nums[j] = keyNum;
				}
			}
		}
	}
}
