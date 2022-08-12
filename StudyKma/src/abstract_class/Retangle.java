package abstract_class;

public class Retangle extends AbsShape {
	private double height;
	private double width;

	private void Retangle() {

	}


	public Retangle() {
		super();

	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public Retangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
