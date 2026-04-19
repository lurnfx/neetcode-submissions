class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1)
            return 1;
        Set sequence = new HashSet<>();
        int longestSeq = 0;

        for (int i = 0; i < nums.length; i++) {
            sequence.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
           
            if (!sequence.contains(nums[i] - 1)) {
                int currentNumber = nums[i];
                int streak = 1;

                while (sequence.contains(currentNumber + 1)) {
                    currentNumber += 1;
                    streak += 1;
                }

                longestSeq = Math.max(longestSeq, streak);
            }
        }
        return longestSeq;
    }
}