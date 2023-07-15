package p1;
class A {
	void m1() {
		System.out.println("Executed from FL OC");
	}
}
class Test {
	static class A {
		void m1() {
			System.out.println("Executed from CL IC");
		}
	
	}
	public static void main(String[] args) {
		class A {
			void m1() {
				System.out.println("Executed from ML IC");	
			}
		}
		System.out.println("Main Method Started");
		A ob=new A();
		ob.m1();
		Test.A ts=new Test.A();
		ts.m1();
		p1.A a1=new p1.A();
		a1.m1();
		System.out.println("Main Method Ended");
	}
}
