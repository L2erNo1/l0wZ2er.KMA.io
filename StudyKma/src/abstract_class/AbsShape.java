package abstract_class;

public abstract class AbsShape {
	private String color;
	private boolean filled;
	
	public AbsShape() {
		
	}

	public AbsShape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Phuong thuc truu tuong: khong co than
	// Tinh chu vi
	public abstract double getPerimeter();
	// Tinh dien tich
	public abstract double getArea();
	
}
