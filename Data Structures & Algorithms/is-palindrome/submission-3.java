class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        String result = s.replaceAll(" ", "");
        int right = result.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(result.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(result.charAt(right))) {
                right--;
            
            } else if (Character.toLowerCase(result.charAt(left))
                != Character.toLowerCase(result.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
