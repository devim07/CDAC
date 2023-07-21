package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
//	@Override
//	public int compareTo(Employee other) {
//		return this.name.compareTo(other.name);
//	}
	
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}

//	@Override
//	public int compareTo(Employee other) {
//		return (int) (this.salary - other.salary);
//	}
	
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-7.2f", this.name, this.empid, this.salary);
	}
}
class CompareByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
class CompareByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpid() - e2.getEmpid();
	}
}
class CompareBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee("Umesh", 15, 55000.50f);
		arr[1] = new Employee("Gautam", 11, 50000.50f);
		arr[2] = new Employee("Chetan", 14, 45000.50f);
		arr[3] = new Employee("Sandeep", 13, 40000.50f);
		arr[4] = new Employee("Digvijay", 12, 35000.50f);
		return arr;
	}
	public static void print( Employee[] arr ) {
		if( arr != null ) {
			for( Employee emp : arr )
				System.out.println(emp.toString());
			System.out.println();
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sort by name");
		System.out.println("2.Sort by empid");
		System.out.println("3.Sort by salary");
		System.out.print("Enter the choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Employee[] arr = Program.getEmployees();
		while ( ( choice = Program.menuList() ) != 0) {
			Comparator<Employee> comparator = null;
			switch( choice ) {
			case 1:
				comparator = new CompareByName();
				break;
			case 2:
				comparator = new CompareByEmpid();
				break;
			case 3:
				comparator = new CompareBySalary();
				break;
			}
			Arrays.sort(arr, comparator);
			Program.print(arr);
		}	
	}
	public static void main2(String[] args) {
		Employee[] arr = Program.getEmployees();
		Program.print( arr );
		
		//Comparator<Employee> comparator = new CompareByName( );	//Upcasting
		//Arrays.sort(arr, comparator);	
		
		Arrays.sort(arr, new CompareByName());
		Program.print( arr );
		
		Arrays.sort(arr, new CompareByEmpid());
		Program.print( arr );
		
		Arrays.sort(arr, new CompareBySalary());
		Program.print( arr );
	}
	public static void main1(String[] args) {
		Employee[] arr = Program.getEmployees();
		Program.print( arr );
		
		Arrays.sort( arr );	//Arrays.sort --> mergeSort--> compareTo
		Program.print( arr );
	}
}
