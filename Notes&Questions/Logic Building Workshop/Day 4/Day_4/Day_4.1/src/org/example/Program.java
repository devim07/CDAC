package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

class Employee implements Comparable<Employee>{
	private String name;
	private int empid;
	private float salary;
	private Date joinDate;
	public Employee() {
	}
	public Employee(String name, int empid, float salary) {
		super();
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
	public Date getJoinDate() {
		return joinDate;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-10.2f", this.name, this.empid, this.salary);
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
class CompareByJoinDate implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getJoinDate().compareTo(e2.getJoinDate());
	}
}
class ListTest{
	//private ArrayList<Employee> empList = new ArrayList<>();
	//private List<Employee> empList = new ArrayList<>();
	private List<Employee> empList;
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void addElements(Employee[] employees) {
		if( this.empList != null ) {
			if( employees != null ) {
				for( Employee emp : employees )
					this.empList.add(emp);
			}
		}
	}
	
	/* public Employee findElement(int empid) {
	 	if( this.empList != null ) {
			for( Employee emp : this.empList ) {
				if( emp.getEmpid() == empid )
					return emp;
			}
		}
		return null;
	} */
	
	public Employee findElement(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				int index = this.empList.indexOf(key);
				Employee value = this.empList.get(index);
				return value;
			}
		}
		return null;
	}
	
	/* public boolean removeElement(int empid) {
	 	if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				int index = this.empList.indexOf(key);
				this.empList.remove(index);
				return true;
			}
		}
		return false;
	} */
	
	public boolean removeElement(int empid) {
		if( this.empList != null ) {
			Employee key = new Employee();
			key.setEmpid(empid);
			if( this.empList.contains(key)) {
				this.empList.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printElements( Comparator<Employee> comparator ) {
		if( this.empList != null ) {
			this.empList.sort(comparator);
			for( Employee emp : this.empList )
				System.out.println(emp.toString());
		}
	}
}
public class Program {
	public static Scanner sc = new Scanner(System.in);
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[ 5 ];
		arr[ 0 ] = new Employee("Davinder",15, 55000.50f);
		arr[ 1 ] = new Employee("Sachin",11, 50000.50f);
		arr[ 2 ] = new Employee("Amit",13, 45000.50f);
		arr[ 3 ] = new Employee("Chetan",12, 40000.50f);
		arr[ 4 ] = new Employee("Ganesh",14, 35000.50f);
		return arr;
	}
	public static void acceptRecord( int[] empid ) {
		System.out.print("Enter empid	:	");
		empid[ 0 ] = sc.nextInt();
	}
	private static void printRecord(Employee value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Employee not found.");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus )
			System.out.println("Employee is removed");
		else
			System.out.println("Employee not found.");
	}
	public static int subMenuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Sort By Name");
		System.out.println("2.Sort By Empid");
		System.out.println("3.Sort By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add element(s)");
		System.out.println("2.Find element");
		System.out.println("3.Remove element");
		System.out.println("4.Print element(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] key = new int[ 1 ];
		ListTest test = new ListTest();
		//test.setEmpList( new ArrayList<>());
		//test.setEmpList( new Vector<>());
		test.setEmpList( new LinkedList<>());
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Employee[] employees = Program.getEmployees();
				test.addElements( employees );
				break;
			case 2:
				Program.acceptRecord( key );
				Employee value = test.findElement( key[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord( key );
				boolean removedStatus = test.removeElement(  key[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				while( ( choice = Program.subMenuList( ) ) != 0 ) {
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
					test.printElements( comparator );
				}
				break;
			}
		}
	}
}
