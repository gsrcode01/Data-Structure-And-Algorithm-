package StackAndQueue;
import java.util.*;
public class ValidParentheses {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();

            for (char c : s.toCharArray()) {

                // push opening brackets
                if (c == '(' || c == '{' || c == '[') {
                    st.push(c);
                }
                else {
                    // if empty → invalid
                    if (st.isEmpty()) return false;

                    char top = st.pop();

                    // check matching
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            return st.isEmpty();
        }
    }
