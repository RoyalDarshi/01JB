public class Rectangle implements Shape{
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+(l*b));
	}
	int l=20;
	int b=30;
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		rect.findArea();
	}
}
