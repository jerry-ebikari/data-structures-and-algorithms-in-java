package com.algorithms.checkBrackets;

import java.util.Stack;

public class CheckBrackets {
    public static boolean checkBrackets(String str) {
        Stack<Character> stack  = new Stack<Character>();
        int stringLength = str.length();
        for(int i = 0; i < stringLength; i++) {
          char c = str.charAt(i);
          if(c == '[' || c == '(' || c == '{' ) {     
            stack.push(c);
          }
          else if(c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
            return false;
          }
          else if(c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
            return false;
          }
          else if(c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
            return false;
          }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(checkBrackets("()[]{}"));	// true
        System.out.println(checkBrackets("[[][]]"));	// true
        System.out.println(checkBrackets("{[()]}"));	// true
        System.out.println(checkBrackets("{[()]()}"));	// true
        System.out.println(checkBrackets("[(])"));		// false
    
    }
}
