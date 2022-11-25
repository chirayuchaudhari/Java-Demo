package CollectionArraylist;

import java.util.Comparator;

public class StudentNameComaparator implements Comparator<Student> {

	@Override
	public int compare(Student s3, Student s4 ) {
		return s3.getName().compareTo(s4.getName());
	}

}
