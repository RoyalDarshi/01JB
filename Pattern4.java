class Pattern4 {
	public static void getPattern(int no){
		for(int i=1;i<=no;i++){
			if(i%2==0){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		getPattern(11);
	}
}
