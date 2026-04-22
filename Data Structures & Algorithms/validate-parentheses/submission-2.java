class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                brackets.add(s.charAt(i));
            } else {
                 if(brackets.isEmpty()){
                    return false;
                 }

                if (s.charAt(i) == ')') {
                    if (brackets.pop() != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (brackets.pop() != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (brackets.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return brackets.isEmpty();
    }
    
}
