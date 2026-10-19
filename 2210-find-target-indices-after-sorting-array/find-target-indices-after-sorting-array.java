import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        int left = 0, right = nums.length - 1;

        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // left is the first index where target can occur
        while (left < nums.length && nums[left] == target) {
            result.add(left);
            left++;
        }

        return result;
    }
}