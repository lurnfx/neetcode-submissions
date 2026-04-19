class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            sequence.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!sequence.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                int currentStreak = 1;

                while (sequence.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}