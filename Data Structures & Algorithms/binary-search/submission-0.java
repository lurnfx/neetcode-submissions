class Solution {
    public int search(int[] nums, int target) {
     //binary serch required sorterd array is allready sorted in this case lets check if target is less than mid index values or greather
     int low =0;
     int high = nums.length -1;
      
      while(low <= high){
         //get the mid of array 1-> 0+(6-0)/2 gets 3 index// 2->
        int mid = low + (high-low)/2;

        if(nums[mid]== target){
          return mid;
        }

        if(target > nums[mid]){
          //lets move to the right half of the array
           low = mid+1;
        }
        else{
          //if less lets move left half of the array
           high = mid-1;
        }

      }
      return -1;
        
    }
}
