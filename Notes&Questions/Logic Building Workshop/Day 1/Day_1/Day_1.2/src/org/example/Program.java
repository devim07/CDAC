package org.example;
class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

class Employee{
	private String name;	//null
	private int empid;		//0
	private float salary;	//0
	private Date joinDate;	//null	//joinDate is a reference
	public Employee() {
	}
	public Employee(String name, int empid, float salary, Date joinDate) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.joinDate = joinDate;
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
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + ", joinDate=" + joinDate + "]";
	}
	
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee( );
		emp.setName("Sandeep");
		emp.setEmpid(18932);
		emp.setSalary(124500);
		//Date joinDate = new Date( 1,1,2009);
		//emp.setJoinDate(joinDate );
		emp.setJoinDate(new Date( 1,1,2009) );
		
		System.out.println(emp.toString());
	}
	public static void main1(String[] args) {
		
		//Date birthDate = null;	//birthDate is a method local reference variable; It will get space on Java Stack.
		//birthDate =  new Date( 23, 7, 1983 );
		 
		Date birthDate = new Date( 23, 7, 1983 );
		System.out.println(birthDate.getDay());
		System.out.println(birthDate.getMonth());
		System.out.println(birthDate.getYear());
	}
}
