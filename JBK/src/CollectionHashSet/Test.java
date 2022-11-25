package CollectionHashSet;



import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;


public class Test {

	public static void main(String[] args) {
		Student s1=new Student(1, "Chirayu", "MSC", 878865266);
		Student s2=new Student(2, "Kunal", "MCA", 955212554);
		Student s3=new Student(3, "Prasad", "MCA", 778865266);
		Student s4=new Student(4, "Chandu", "BE", 558865266);
		Student s5=new Student(5, "Rakhi", "ME", 1234565266);
		
		HashSet<Student> list=new HashSet<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);//insertion order not maintain
		list.add(s5);//duplicate are not allowed
		list.add(null);//single null allowed
		list.add(null);// multiple null not allowed
		
		
		System.out.println("*****foreach*****");
		
		list.forEach(s->System.out.println(s));
		
		System.out.println("*****Enhance for*****");
		
		for(Student s:list)
			System.out.println(s);
		
		System.out.println("*****Iterator*****");
		
	    Iterator iter = list.iterator();
	    while (iter.hasNext())
	    {
	         System.out.println(iter.next());
	    }
	    
	    System.out.println("*****Enumeration*****");
	    
	    Enumeration<Student> s = Collections.enumeration(list);
	    while(s.hasMoreElements())
	      System.out.println(s.nextElement());
	   }
		

	}

	

