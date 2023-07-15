class ReverseNum 
{
	public static void main(String[] args) 
	{
		int i=4543;
		int l=i;
		int j=0;
		int k=0;
		while(i!=0){
			k=i%10;
			j=j*10+k;
			i=i/10;
		}
		if(l==j){
			System.out.println(l+" Number is palindrome ");
		}
		else{
			System.out.println(l+" Number is  not palindrome ");
		}
	}
}
