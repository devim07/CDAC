package org.example;

class Singleton{
	private int number;
	private Singleton( ) {
	}
	private static Singleton reference = null;
	public static Singleton getReference( ) {
		if( reference == null )
			reference = new Singleton();
		return reference;
	}
	public int getNumber() {
		return number;
	} 
	public void setNumber(int number) {
		this.number = number;
	}
}
public class Program {
	public static void main(String[] args) {
		Singleton s1 =  Singleton.getReference();
		s1.setNumber(123);
		System.out.println("Number	:	"+s1.getNumber());
	}
}
