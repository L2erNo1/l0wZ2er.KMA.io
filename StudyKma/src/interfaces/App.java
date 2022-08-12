package interfaces;

public class App {

	public static void main(String[] args) {
		IShape c = new Circle(5);
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
	}

}
