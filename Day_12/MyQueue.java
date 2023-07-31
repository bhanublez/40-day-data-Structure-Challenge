import java.util.Stack;

class MyQueue {

    Stack<Integer> amit;
    Stack<Integer> anmol;

    public MyQueue() {
         amit = new Stack<>();
         anmol = new Stack<>();
    }
    
    public void push(int x) {
        while(!amit.isEmpty()){
            anmol.push(amit.pop());
        }
        amit.push(x);
        while(!anmol.isEmpty()){
            amit.push(anmol.pop());
        }
    }
    
    public int pop() {
        return amit.pop();
    }
    
    public int peek() {
        return amit.peek();
    }
    
    public boolean empty() {
        return amit.isEmpty();
    }
}