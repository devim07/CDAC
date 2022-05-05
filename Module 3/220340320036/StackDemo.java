import java.util.*;

class Stack{
	int size;
	int top1;
	int top2;
	int arr[];
	
	Stack(int s){
		size=s;
		arr=new int[size];
		top1=-1;
		top2=size;
	}
	
	boolean isFull(){
		if(top1+1==top2)
			return true;
		else
			return false;
	}
	
	boolean isEmpty(int n){
		if(n==1 && top1==-1)
			return true;
		if(n==2 && top2==size)
			return true;
		else
			return false;
	}
	
	void push1(int d){
		if(this.isFull()){
			System.out.println("Stack is full. Cannot add more data");
			return;
		}
		arr[++top1]=d;
		return;
	}
	
	void push2(int d){
		if(isFull()){
			System.out.println("Stack is full. Cannot add more data");
			return;
		}
		arr[--top2]=d;
		return;
	}
	
	int pop1(){
		if(isEmpty(1)){
			System.out.println("Stack-1 is Empty. Cannot delete data");
			return -1;
		}
		System.out.println("Popped element from stack1 is "+arr[top1]);
		return arr[top1--];
	}
	
	int pop2(){
		if(isEmpty(2)){
			System.out.println("Stack-2 is Empty. Cannot delete data");
			return -2;
		}
		System.out.println("Popped element from stack2 is "+arr[top2]);
		return arr[top2++];
	}
}

class StackDemo{	
	public static void main(String args[]){
		Stack s=new Stack(10);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		s.pop1();
		s.pop2();
	}
}