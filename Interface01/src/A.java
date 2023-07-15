public class A implements I {
	public static void main(String[] args) {
		I i = new I() {

			@Override
			public void m1() {

				System.out.println("Hello...");
			}
		};
		i.m1();
	}

	@Override
	public void m1() {

	}
}
