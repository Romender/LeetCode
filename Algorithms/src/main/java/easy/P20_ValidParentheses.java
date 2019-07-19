package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20_ValidParentheses {

    public boolean isValid(String s) {
        return thirdSolution(s);
    }

    public boolean secondSolution(String s) {
        if(s.isEmpty()) return true;
        if(s.length() %2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i= 0 ;i < s.length(); i++) {
            char k = s.charAt(i);
            switch (k) {
                case '{' : stack.push('}');break;
                case '[' : stack.push(']');break;
                case '(' : stack.push(')');break;
                default:
                    if(stack.isEmpty() || stack.pop() != k)
                        return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean thirdSolution(String s) {
        if(s.isEmpty()) return true;
        if(s.length() %2 == 1) return false;
        int head = -1;
        int count =1;
        for (int i= 0 ;i < s.length(); i++) {
            char k = s.charAt(i);
            switch (k) {
                case '{' :
                case '[' :
                case '(' : head=i;break;
                case '}' : if(s.charAt(head) == '{') head+=1; else return false; break;
                case ']' : if(s.charAt(head) == '[')head+=1; else return false; break;
                case ')' : if(s.charAt(head) == '(')head+=1; else return false; break;
                default: return false;
            }
        }
        return head==-1;
    }


    public boolean firstSolution(String s) {
        if(s.isEmpty()) return true;
        if(s.length() %2 == 1) return false;
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        for (int i= 0 ;i < s.length(); i++) {
            if(map.values().contains(s.charAt(i))){
                stack.push(s.charAt(i));
            } else if(!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
