package lab.cg;

import java.sql.Date;

public class Employee {
	static int count;
 int id;
String firstName;
String lastName;
double salary;
String grade;
String joiningMonth;

Employee(String firstName,String lastName,double salary,String grade,String joiningMonth)
{
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.grade= grade;
	this.joiningMonth = joiningMonth;
    this.id=++count;	
}
void display()
{
	System.out.println("ID is "+this.id);
	System.out.println("First Name is "+firstName);
	System.out.println("Last Name is "+lastName);
	System.out.println("Salary is "+salary);
	System.out.println("grade is "+grade);
	System.out.println("JoiningMont is "+joiningMonth);

//	System.out.println("Joining Date"+ ChangeDate.toString());
	System.out.println("Joining Date"+ ChangeDate);
	System.out.println("Total number of Employess are"+count);
}
private Date ChangeDate;

public Employee(String firstName, Date ChangeDate) {
	this.firstName = firstName;
	this.ChangeDate = ChangeDate;
}

}
class Hr
{
public static void main(String[] args)
{
		Employee E= new Employee("meenal","jain",1234567,"A","8/2018");
		Employee E2= new Employee("Vinayak","jain",1234567,"A","8/2018");
		Employee E3= new Employee("Hari","jain",1234567,"A","8/2018");
		E.display();E2.display();E3.display();
}
}