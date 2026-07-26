class Solution {
    public int findPeakElement(int[] nums) {
          int n = nums.length;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Check left neighbor if exists
            boolean left = (i == 0) || (nums[i] >= nums[i - 1]);
            // Check right neighbor if exists
            boolean right = (i == n - 1) || (nums[i] >= nums[i + 1]);

            // If both conditions are true
            if (left && right) return i;
        }

        // In case no peak found
        return -1;
    }
}