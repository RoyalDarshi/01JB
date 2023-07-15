package p1;
class A {
	void m1() {
		System.out.println("Executed from FL OC");
	}
}
class Test {
	class A {
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
		System.out.println("Main Method Ended");
	}
}
