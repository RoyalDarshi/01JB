class Pattern2 {
	public static void getPattern(int no){
		for(int i=1;i<=no;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=no-i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		getPattern(4);
	}
}
