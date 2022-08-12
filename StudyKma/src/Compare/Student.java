package Compare;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double mark;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
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

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		// Lam the nào để biết 2 sinh viên có điểm thế nào với nhau
		if(this.mark > o.mark) {
			return 1;
		}
		else if(this.mark < o.mark) {
			return -1;
		}
		else {
			return (this.name.compareTo(o.name));
		}
	}
	
	

}
