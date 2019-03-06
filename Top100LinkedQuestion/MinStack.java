class MinStack {

    private Stack<Wrapper> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Wrapper>();
    }
    
    public void push(int x) {
        if(!stack.isEmpty()){
            Wrapper t = stack.peek();
            Wrapper a = new Wrapper();
            a.value = x;
            a.minSoFar = Math.min(x,t.minSoFar);
            stack.push(a);
        }
        else{
            Wrapper a = new Wrapper();
            a.value = x;
            a.minSoFar = x;
            stack.push(a);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())stack.pop();
    }
    
    public int top() {
        Wrapper t = stack.peek();
        return t.value;
    }
    
    public int getMin() {
        Wrapper t = stack.peek();
        return t.minSoFar;
    }
    private class Wrapper{
        int value;
        int minSoFar;
        public Wrapper(){
            value = 0;
            minSoFar = 0;
        }
    }
}