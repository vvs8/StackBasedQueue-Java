import java.util.*;

public class StackQ {

	Stack<String> stack1; 
	Stack<String> stack2;

  public StackQ() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }
	
  private void push(Stack<String> st, String data) {  
		st.push(data); 
	} 

	private String pop(Stack<String> st) {  
		return st.pop(); 
	} 

	public void enQueue(String s) { 
		push(stack1, s); 
	} 

	public String deQueue() { 
    if (stack1.isEmpty() && stack2.isEmpty()) { 
			return null; 
		} 
    String temp; 
		if (stack2.isEmpty()) { 
			while (!stack1.isEmpty()) { 
				temp = pop(stack1); 
				push(stack2, temp); 
			} 
		} 
		temp = pop(stack2); 
    return temp; 
	} 

}
