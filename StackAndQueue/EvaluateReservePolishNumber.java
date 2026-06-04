package StackAndQueue;

public class EvaluateReservePolishNumber {
    public int evalRPN(String[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("+") ||
                    arr[i].equals("-") ||
                    arr[i].equals("*") ||
                    arr[i].equals("/")) {

                int a = stack.pop();
                int b = stack.pop();

                int ans = 0;

                if (arr[i].equals("+"))
                    ans = b + a;
                else if (arr[i].equals("-"))
                    ans = b - a;
                else if (arr[i].equals("*"))
                    ans = b * a;
                else
                    ans = b / a;

                stack.push(ans);
            }
            else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }

        return stack.pop();
    }
}
