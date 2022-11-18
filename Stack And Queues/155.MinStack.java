class MinStack {
   Stack<Integer> stack = new Stack<>();
   Stack<Integer> min_value = new Stack<>();

    
    public void push(int val) {
        if(min_value.isEmpty() || val <= min_value.peek())
        {
            min_value.push(val);
        }
       stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(min_value.peek()))
        {
            min_value.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return min_value.peek();
        
    }
    
}
