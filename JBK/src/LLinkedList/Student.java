package LLinkedList;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private float gp;
	
	public Student(int id, String name, float gp) {
		super();
		this.id = id;
		this.name = name;
		this.gp = gp;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGp() {
		return gp;
	}
	public void setGp(float gp) {
		this.gp = gp;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gp=" + gp + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gp, id, name);
	}







	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(gp) == Float.floatToIntBits(other.gp) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student o) {
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		else
			return 0;
	}

}
