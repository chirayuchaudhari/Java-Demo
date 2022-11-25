package LLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
	Student s1=new Student(11, "somya", 8.5f);
	Student s2=new Student(15, "gomya", 5.5f);
	Student s3=new Student(12, "gotya", 6.5f);
	Student s4=new Student(13, "pintya", 7.5f);
	
	LinkedList<Student> ll = new LinkedList<Student>();
	ll.add(s1);
	ll.add(s2);
	ll.add(s3);
	ll.add(s4);
	
	ll.forEach(System.out::println);
	
	Collections.sort(ll,new  NameComparator());
	ll.forEach(s->System.out.println(s));
	
	}
	

}
