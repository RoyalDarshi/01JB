class Mock3a 
{
	static void print(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		print();
	}
}
