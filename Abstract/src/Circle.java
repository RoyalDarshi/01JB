package src;
public class Circle implements Shape{
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle: "+(22/7*r*r));
	}
	double r=12.5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle crcl = new Circle();
		crcl.findArea();
	}

}
