package CollectionArraylist;

import java.util.Comparator;

public class StudentCourceComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getCource().compareTo(s2.getCource());
	}

}
