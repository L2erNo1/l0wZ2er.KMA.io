package inheritance;

public class Employee extends Person {
	private int id;
	private double salary;
	private float percentCommission;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, double salary, float percentCommission) {
		this.id = id;
		this.salary = salary;
		this.percentCommission = percentCommission;
	}
	public Employee(int id, double salary, float percentCommission,String licence, String name, String address) {
		super(licence, name, address);
		this.id = id;
		this.salary = salary;
		this.percentCommission = percentCommission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getPercentCommission() {
		return percentCommission;
	}

	public void setPercentCommission(float percentCommission) {
		this.percentCommission = percentCommission;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", percentCommission=" + percentCommission
				+ ", getLicence()=" + getLicence() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ "]";
	}
	
}
