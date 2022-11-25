package CollectionVector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(1, "Chirayu", "MSC", 878865266);
		Student s2=new Student(2, "Kunal", "MCA", 955212554);
		Student s3=new Student(3, "Prasad", "MCA", 778865266);
		Student s4=new Student(4, "Chandu", "BE", 558865266);
		Student s5=new Student(5, "Rakhi", "ME", 1234565266);
		
		Vector<Student> v=new Vector<Student>();
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		v.add(s5);//insertion order maintained
		v.add(s5);//duplicate are allowed
		v.add(null);//single null allowed
		v.add(null);// multiple null allowed
		
		System.out.println("*****for loop*****");
		
		for (int i = 0; i < v.size(); i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("*****foreach*****");
		
		v.forEach(s->System.out.println(s));
		
		System.out.println("*****Enhance for*****");
		
		for(Student s:v)
			System.out.println(s);
		
		System.out.println("*****Iterator*****");
		
	    Iterator iter = v.iterator();
	    while (iter.hasNext())
	    {
	         System.out.println(iter.next());
	    }
	    
	    System.out.println("*****for printing******");
	    v.forEach(System.out::println);

	    
	    System.out.println("*****Enumeration*****");
	    
	    Enumeration<Student> s = Collections.enumeration(v);
	    while(s.hasMoreElements())
	      System.out.println(s.nextElement());
	   }
		

	}

	

