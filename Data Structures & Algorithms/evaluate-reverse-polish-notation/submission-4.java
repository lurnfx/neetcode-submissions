class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for (String s : tokens) {

            if ("+-*/".contains(s) && s.length() == 1) {
                    int last = stack.pop();
                    int first = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(first + last); break;
                    case "*":
                        stack.push(first * last); break;
                    case "-":
                        stack.push(first - last); break;
                    case "/":
                        stack.push(first / last); break;
                }

            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
