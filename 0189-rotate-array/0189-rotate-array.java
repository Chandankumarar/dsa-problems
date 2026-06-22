class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
          reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        // int n = nums.length;
        // k = k % n;

        // if (k == 0) return;

        // int[] temp = new int[k];
        // int j = 0;

        // // store last k elements
        // for (int i = n - k; i < n; i++) {
        //     temp[j++] = nums[i];
        // }

        // // shift remaining elements to the right
        // for (int i = n - k - 1; i >= 0; i--) {
        //     nums[i + k] = nums[i];
        // }

        // // put temp elements at beginning
        // for (int i = 0; i < k; i++) {
        //     nums[i] = temp[i];
        // }
    }

    static void reverse(int[] nums,int l,int r){
        while(l<=r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;r--;
        }
    }
}