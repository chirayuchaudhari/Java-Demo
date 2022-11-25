package CollectionHashSet;

public class Student {
	private int rollno;
	private String name;
	private String cource;
	private long mobno;
	
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cource == null) ? 0 : cource.hashCode());
		result = prime * result + (int) (mobno ^ (mobno >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
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
		if (cource == null) {
			if (other.cource != null)
				return false;
		} else if (!cource.equals(other.cource))
			return false;
		if (mobno != other.mobno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cource=" + cource + ", mobno=" + mobno + "]";
	}
	
	
	
	
	
}
