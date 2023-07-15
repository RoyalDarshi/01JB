class Pattern3 {
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
		for(int x=1;x<no;x++){
			for(int y=0;y<x;y++){
				System.out.print(" ");
			}
			for(int z=no-x;z>=1;z--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		getPattern(12);
	}
}
