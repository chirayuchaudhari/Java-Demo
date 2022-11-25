package CollectionHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import CollectionTreeSet.Student;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student(1, "chirayu", "msc", 878865266);
		Student s2=new Student(2, "kunal", "mca",   188865266);
		Student s3=new Student(3, "prasad", "bsc",  112886526);
		Student s4=new Student(4, "chandu", "be",   878865266);
		
		HashMap<String, String> hm=new HashMap<>();
		hm.put("1", "chirayu");
		hm.put("2", "kunal");
		hm.put("3", "prasad");
		hm.put("4", "chandu");
		hm.put("2", "bunty");

		System.out.println("******** Iterator keyset is a method ******************");
		Iterator<String> it = hm.keySet().iterator();       
		while(it.hasNext())  
		{  
			String key=(String)it.next();  
			System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}
		
		System.out.println("********Enhance for using keyset() method for iteration over keySet******************");
		for (String Student : hm.keySet())    
			System.out.println("Student: " + Student); 
		
		System.out.println("********Enhance for using values() for iteration over keys******************");
		for (String Stud : hm.values())        
			System.out.println("Student: " + Stud);  
		
		System.out.println("********For each******************");
		hm.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
	}
}
