class Stack{
	final int max;
	int top= -1;
	int[] s;
	Stack(int size){
		this.max = size;
		this.s = new int[max];
	}
	boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}
	boolean isFull(){
		if(top >= max - 1)
			return true;
		else
			return false;
	}
	void push(int val){
		if(top < max - 1){
			s[++top] = val;
		}else 
			System.out.println("Stack is Full!!");
	}
	int pop(){
		if(top == -1){
			System.out.println("Stack is Empty!!");
			return -1;
		}
		return s[top--];
	}
	int peek(){
		if(top == -1){
			System.out.println("Stack is Empty!!");
			return -1;
		}
		return s[top];
	}
	void display(){
		for(int i=top; i>=0; i--){
			System.out.println(s[i]);
		}
	}
	
}

class StackDemo{
	public static void main(String[] args){
		Stack s1 = new Stack(5);
		System.out.println(s1.isEmpty());
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(20);
		s1.push(15);
		s1.display();
		System.out.println(s1.isFull());
		System.out.println(s1.pop()+" is popped from the Stack");
		System.out.println(s1.peek()+" is the top value in the Stack");
		
		s1.display();
	}
}