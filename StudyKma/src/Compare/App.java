package Compare;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Duc Ninh", 3.0);
		Student s2 = new Student(1, "Duc Ninh", 3.0);
		System.out.println(s1.compareTo(s2));
	}
}
