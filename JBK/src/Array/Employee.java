package Array;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String city;
	private String mob;
	private float salary;
	
	

	public void Employee()
	{
	}
	
	

	public Employee(int id, String name, String city, String mob, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mob = mob;
		this.salary = salary;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee employee) {
		if(this.id>employee.id)
			return 1;
		else if(employee.id>this.id)
			return -1;
		else
			return 0;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", mob=" + mob + ", salary=" + salary + "]";
	}
	
	
	
}
