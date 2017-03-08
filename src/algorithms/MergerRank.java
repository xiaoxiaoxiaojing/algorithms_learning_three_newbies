package algorithms;

public class MergerRank {
	public static void main(String[] args) {

	}

	static void mergerRank(int[] nums, int right, int left) {
		if (right + 1 < left) {
			int mid = (left + right) / 2;
			mergerRank(nums, right, mid);
			mergerRank(nums, mid, left);
		}
		if (nums[right] > nums[left]) {
			int buff = nums[right];
			nums[right] = nums[left];
			nums[left] = buff;
		}
	}
}
