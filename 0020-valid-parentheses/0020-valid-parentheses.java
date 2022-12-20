class Solution {
    public boolean isValid(String s) {
           if(s.length() % 2 != 0){
            return false; //base case, all elements need to have a pair. So total count should be even 
        }
        
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){  //push all opening braces to stack & compare them with closed ones later. 
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(' ){ //if top element in stack is ( and given element is ) then remove that pair. 
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else{
                return false; //when cases like }}, )), ([}}]) this will return false
            }  //stack.push(c)
        }
        return stack.isEmpty(); //when every pair is removed then stack becomes empty & it is true. else false
    }
}

