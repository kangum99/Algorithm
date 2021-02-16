package stackQueue;

import java.util.Stack;

public class Leet155_stack {
	//Stack 구현 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	class Node {
		int num, min;
		//생성자
		Node(int num, int min){
			this.num = num;
			this.min = min;
		}
	}
	
	Stack<Node> s = new Stack<>();
    
    public void push(int x) {
        Node n = null;
        if (s.isEmpty()) {
        	//min을 바꿀 필요가 없다.
        	n = new Node(x, x);
        }else {
        	//min을 비교해서 바꿔주자.
        	n = new Node(x, x < s.peek().min ? x : s.peek().min);
        }
        s.push(n);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
    	return s.peek().num;
        
    }
    
    public int getMin() {
        return s.peek().min;
    }

}
