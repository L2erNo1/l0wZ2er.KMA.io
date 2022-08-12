package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(new Student(1, "Ninh", 3.0));
		lstStudent.add(new Student(4, "Quang", 7.0));
		lstStudent.add(new Student(2, "Duc", 5.0));

		display(lstStudent);
		// 2. Su dung Collection Sort
		MarkComparator m = new MarkComparator();
		Collections.sort(lstStudent, m);
		System.out.println("====================");
		display(lstStudent);
		
		
		// =======Lambda========
		Collections.sort(lstStudent, (a, b) -> a.getName().length() - b.getName().length());
		System.out.println("====================");
		display(lstStudent);
	}

	private static void display(List<Student> lstStudent) {
		for (Student s : lstStudent) {
			System.out.println(s);
		}
	}
}
