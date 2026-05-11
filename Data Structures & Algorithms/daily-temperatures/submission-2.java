class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    //optimise solution with stack
        int [] days = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            
           while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
               int prevIndex = stack.pop();
               days[prevIndex] = i-prevIndex;
           }

          stack.push(i);
        }
        return days;
        
    }
}
