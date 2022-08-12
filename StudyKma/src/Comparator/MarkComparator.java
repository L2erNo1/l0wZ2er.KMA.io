package Comparator;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {


	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return (int)(a.getMark() - b.getMark());
	}

}
