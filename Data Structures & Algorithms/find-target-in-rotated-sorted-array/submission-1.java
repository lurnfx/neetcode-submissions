class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;   // 3 + (5-3) /2 3+3 /2 => 3
            // if nums[mid] values  is equal to target then it will retur the mid as index
            if (nums[mid] == target) {
                return mid;
            }
            // here logic is to check if the left values of index starting is less than the mide
            // value of the nums
            //check if the left half sorted
            if (nums[left] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                //check if right half sorted
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
