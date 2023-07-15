class Pattrn1 {
	public static void getPattern(int no){
		for(int i=1;i<=no;i++){
			for(int j=1;j<no-j;j++){
				System.out.print("*");
			}
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		getPattern(4);
	}
}
