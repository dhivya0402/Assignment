class Person{

	public String name;
	protected int age;
	//private int socialSecurityNumber;
	String address;
	Person(String name,int age,int ssn,String address) {
		this.name=name;
		this.age=age;
		//this.socialSecurityNumber=ssn;
		this.address=address;
		
	}
	


}

class Employee extends Person{
	Employee(String name,int age,int ssn,String address){
		super(name,age,ssn,address);
		System.out.println("Hello Employee");
	}
	
}


public class Person1{
public static void main(String[] args) {
	Employee emp_1=new Employee("Dhivya",25,123,"Madurai");
	
	
	System.out.println(emp_1.name);
	System.out.println(emp_1.address);
	System.out.println(emp_1.age);
	//System.out.println(emp_1.socialSecurityNumber);
	
	
}
}
