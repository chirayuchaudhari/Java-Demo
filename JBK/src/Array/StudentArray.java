package Array;

public class StudentArray {
	private int id;
	private String name;
	private String cource;
	private String city;
	public Float gp;
	
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
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Float getGp() {
		return gp;
	}
	public void setGp(Float gp) {
		this.gp = gp;
	}
	public StudentArray(int id, String name, String cource, String city, Float gp) {
		super();
		this.id = id;
		this.name = name;
		this.cource = cource;
		this.city = city;
		this.gp = gp;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((cource == null) ? 0 : cource.hashCode());
		result = prime * result + ((gp == null) ? 0 : gp.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentArray other = (StudentArray) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (cource == null) {
			if (other.cource != null)
				return false;
		} else if (!cource.equals(other.cource))
			return false;
		if (gp == null) {
			if (other.gp != null)
				return false;
		} else if (!gp.equals(other.gp))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentArray [id=" + id + ", name=" + name + ", cource=" + cource + ", city=" + city + ", gp=" + gp
				+ "]";
	}
	
	
	
	
	
	
	
	
}
