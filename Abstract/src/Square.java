public class Square implements Shape {
	@Override
	public void findArea() {

		System.out.println("Area of Square: " + (s * s));
	}

	int s = 25;

	public static void main(String[] args) {
		Square sqr = new Square();
		sqr.findArea();
	}
}
