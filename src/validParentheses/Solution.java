package validParentheses;

import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> dicionario = new HashMap<>();
        dicionario.put('(', ')');
        dicionario.put('[', ']');
        dicionario.put('{', '}');


        List<Character> chars = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            if(currentChar == '(' || currentChar == '[' || currentChar == '{'){
                chars.add(currentChar);
            } else if(currentChar == ')' || currentChar == ']' || currentChar == '}'){
                if(chars.isEmpty()){
                    return false;
                }

                if(!(dicionario.get(chars.getLast()) == currentChar)){
                    return false;
                } else {
                    chars.removeLast();
                }

            }

        }

        return chars.isEmpty();

    }

    public boolean isValidSecondApproach(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '('){
                stack.push(')');
            } else if (currentChar == '['){
                stack.push(']');
            } else if(currentChar == '{'){
                stack.push('}');
            } else {
                if(stack.isEmpty() || stack.pop() != currentChar){
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }

}