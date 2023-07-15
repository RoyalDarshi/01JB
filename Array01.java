class Array01
{
	static class Display
	{
		void show(int[] mk) {
			System.out.println(mk);
			for (int i=0;i<mk.length;i++)
			{
				System.out.println("Marks is:"+mk[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println();
		int[] marks={76,54,87,98,67,38,29,25};
		Display sh=new Display();
		sh.show(marks);
		System.out.println(marks);
	}
}
