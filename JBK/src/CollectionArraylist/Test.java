package CollectionArraylist;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class Test{

	public static void main(String[] args) {
		Student s1=new Student(1, "Chirayu", "MSC", 878865266);
		Student s2=new Student(2, "Kunal", "MCA", 955212554);
		Student s3=new Student(22, "Prasad", "MCA", 778865266);
		Student s4=new Student(4, "Chandu", "BE", 558865266);
		Student s5=new Student(5, "Rakhi", "ME", 1234565266);

		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);//insertion order maintained
		list.add(s5);//duplicate are allowed
	//	list.add(null);//single null allowed
	//	list.add(null);// multiple null allowed

		System.out.println("sorted on the basis of id using comparable");
		
		Collections.sort(list);
		

		System.out.println("*****for loop*****");

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}


		
		System.out.println("*****Iterator*****");

		Iterator iter = list.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}

		System.out.println("*****for printing******");
		list.forEach(System.out::println);


		System.out.println("*****Enumeration*****");

		Enumeration<Student> s = Collections.enumeration(list);
		while(s.hasMoreElements())
			System.out.println(s.nextElement());
		
		System.out.println("********sorted on the basis of cource using comparator******");
		
		Collections.sort(list,new StudentCourceComparator());
		list.forEach(a->System.out.println(a));
		

		System.out.println("******sorted on the basis of name using comparator**********");
		
		Collections.sort(list,new StudentNameComaparator());
		list.forEach(a->System.out.println(a));
		
	}

	
	
}




