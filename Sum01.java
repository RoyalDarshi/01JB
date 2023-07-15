//Here static not allowed
class Sum01 {
	//Here without static not allowed
	public static void main(String[] args) {
		class Calc {	//Here static not allowed
			static void calculate(int a, int b) {
			System.out.println(a+b);
			}
		}
		int x=10;
		int y=20;
		Calc cal=new Calc();
		cal.calculate(x,y);
	}
}
