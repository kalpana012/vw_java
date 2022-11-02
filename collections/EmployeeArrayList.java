package collections;

import java.util.*;


public class EmployeeArrayList {
	List<Employee> lst = new ArrayList<Employee>();
	

Employee e1 = new Employee(2,"Raj Malhotra",25000,10);

Employee e = e1;
         
//   Employee e = new Employee(1,"Anubhav Sinha",15000,10);
 
System.out.println(e==e1); //true , == checks whether object is actually same (same memory)

e.setSalary(2500);



System.out.println("e1's salary:"+e1.getSalary());}
}