package CollectionTreeSet;

import java.util.Iterator;


public class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private String cource;
	private long mobno;

	public Student()
	{

	}

	public Student(int rollno, String name, String cource, long mobno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cource = cource;
		this.mobno = mobno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	@Override
	public int hashCode() {

		return rollno;
	}

	@Override
	public boolean equals(Object obj) {
		Student t =(Student)obj;
		if(this.rollno == t.rollno)
			return true ;
		else 
			return false;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cource=" + cource + ", mobno=" + mobno + "]";
	}

	@Override
	public int compareTo(Student o) {
		return new Integer(this.rollno).compareTo(o.rollno);
	}

	




}
