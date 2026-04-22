class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxCapacity = 0;

        while (left < right) {
            int width = right - left; // 7-0
            int length = Math.min(heights[right], heights[left]);   // 6
            int currentCapacity = width * length;  //6*6 = 36

            maxCapacity = Math.max(currentCapacity, maxCapacity);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxCapacity;
    }
}
