package question1;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	int salary;
	public Employee(int id, String name, int age, int salary)  {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Employee o) 	//used method to generate the logic
	{
		if(salary==o.salary) return 0;				//comparing the element 	
		else if(salary>o.salary) return 1;
		else return -1;
	}
	
	

}
