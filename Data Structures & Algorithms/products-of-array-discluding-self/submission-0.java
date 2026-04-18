class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        //brute force approch to check the product O(n2) approch 
        while (i < n) {
            int j = 0;
            int product = 1;
            while (j < n) {
                if (i != j) {
                    product = product * nums[j];
                }
                res[i] = product;
                j++;
            }
            i++;
        }
        return res;
    }
}
