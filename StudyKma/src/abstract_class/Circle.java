package abstract_class;

public class Circle extends AbsShape {
	private double radius;//ban kinh
	
	public Circle() {
		
	}
	
	public Circle( double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.pow(radius, radius) * Math.PI;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}




	

}
