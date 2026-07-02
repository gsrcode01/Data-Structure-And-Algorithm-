package StackAndQueue;

public class RemoveOutermostParentheseswithoutStack {

    public String removeOuterParenthesesFirstApproch(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');

                if(stack.size() > 1){
                    ans.append('(');
                }
            }else{
                if(stack.size() > 1){
                    ans.append(')');
                }

                stack.pop();
            }
        }
        return ans.toString();
    }
    public String removeOuterParenthesesSecondApproch(String s) {
        int level = 0;
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                level++;

                if (level > 1) {
                    ans.append(c);
                }

            } else {

                if (level > 1) {
                    ans.append(c);
                }

                level--;
            }
        }

        return ans.toString();
    }
}
