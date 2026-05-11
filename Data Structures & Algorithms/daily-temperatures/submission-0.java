class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //start with brute forceapproch
        //first create the temp array to store the temp days
        int [] days = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            int day = 0;
            for(int j=i+1; j<temperatures.length; j++){

                if(temperatures[i] < temperatures[j]){
                    days[i] = j-i;
                    break;
                }
            }
        }
        return days;
        
    }
}
