package CollectionTreeSet;

import java.util.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class Testt {

	public static void main(String[] args) {
		Student s1=new Student(12, "Chirayu", "MSC", 878865266);
		Student s2=new Student(2, "Kunal", "MCA", 955212554);
		Student s3=new Student(13,"Prasad", "MCA", 778865266);
		Student s4=new Student(4, "Chandu", "BE", 558865266);
		Student s5=new Student(15,"Rakhi", "ME", 1234565266);
		
		TreeSet<Student> t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);//insertion order not maintain
		t.add(s5);//duplicate are not allowed
		//t.add(null);//single null allowed
		//t.add(null);// multiple null not allowed
	
		System.out.println("*****foreach*****");
		
		t.forEach(s->System.out.println(s));
		
		System.out.println("*****Enhance for*****");
		
		for(Student s:t)
			System.out.println(s);
		
		System.out.println("*****Iterator*****");
		
	    Iterator iter = t.iterator();
	    while (iter.hasNext())
	    {
	         System.out.println(iter.next());
	    }
	    
	    System.out.println("*****Enumeration*****");
	    
	    Enumeration<Student> s = Collections.enumeration(t);
	    while(s.hasMoreElements())
	      System.out.println(s.nextElement());
	   }

}
