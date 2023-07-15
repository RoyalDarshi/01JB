class Pattern1 {
	public static void getPattern(int no){
		for(int i=1;i<=no;i++){
			for(int j=1;j<=no-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		getPattern(7);
	}
}
