package inheritance;

public class Person {
	private String licence;
	private String name;
	private String address;
	
	public Person() {
		
	}

	public Person(String licence, String name, String address) {
		super();
		this.licence = licence;
		this.name = name;
		this.address = address;
	}

	protected String getLicence() {
		return licence;
	}

	protected void setLicence(String licence) {
		this.licence = licence;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}
	
}
