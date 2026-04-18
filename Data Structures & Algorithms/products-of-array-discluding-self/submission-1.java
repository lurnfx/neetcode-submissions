class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
    
        //Lets create the product of left 
        res[0] = 1;
        for(int i=1; i<n; i++){
          res[i] = res[i-1]*nums[i-1];   // res[n] = 1*1 = res[] = 1, 1, 2, 8
        }

        //lets calulate the products from right
        int right=1;
        for(int i= n-1 ; i>=0; i--){   // res[3] = 8 
         res[i] = res[i]*right;                 //res[2] 2*6 =12    // res[1] = 24   // res[0] = 48
         right *= nums[i];   //right = 6     right=    6*4   = 24
        }

       
   
        return res;
    }
}
