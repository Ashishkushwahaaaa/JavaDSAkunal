package StacksAndQueue.Questions;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        String s = "()({}))";
        ValidParanthesis valid = new ValidParanthesis();
        System.out.println(valid.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push((s.substring(i, i+1)));
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                if(s.charAt(i)==')'){
                    String removed = stack.pop();
                    if(!removed.equals("(")){
                        return false;
                    }
                }
                else if(s.charAt(i)=='}'){
                    String removed = stack.pop();
                    if(!removed.equals("{")){
                        return false;
                    }
                }
                else if(s.charAt(i)==']'){
                    String removed = stack.pop();
                    if(!removed.equals("[")){
                        return false;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
