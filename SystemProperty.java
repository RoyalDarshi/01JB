class SystemProperty {
	public static void main(String[] args) {
		int a=Integer.parseInt(System.getProperty("fno"));
		int b=Integer.parseInt(System.getProperty("sno"));
		System.out.println("Result: "+(a+b));
	}
}
