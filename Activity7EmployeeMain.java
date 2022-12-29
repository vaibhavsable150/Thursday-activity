package question1;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Vaibhav",20,45000);
		Employee e2=new Employee(3,"Pratik",18,90000);
		Employee e3=new Employee(5,"Dipak",21,250000);
		Employee e4=new Employee(4,"Akash",24,44000);
		
		ArrayList<Employee> el=new ArrayList<>();
		el.add(e1);				//adding the element to the list
		el.add(e2);
		el.add(e3);
		el.add(e4);
		
		Collections.sort(el);		//sorting the element in ascending order
		for(Employee o:el)
		{
			System.out.println(o.id+" "+o.name+" "+o.age+" "+o.salary);
		}

	}

}
