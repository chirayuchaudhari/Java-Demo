package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"chirayu","pune","88888",25000.0f);
		Employee e2=new Employee(2,"kunal","karvenagar","99999",30000.0f);
		Employee e3=new Employee(9,"yogesh","katraj","77777",24000.0f);
		Employee e4=new Employee(8,"pratik","kharadi","66666",27000.0f);
		Employee e5=new Employee(5,"prasad","narhe","55555",28000.0f);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		//for sorting
		Collections.sort(al);
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		for(Employee s:al)
			System.out.println(s);
		
		System.out.println();
		
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
