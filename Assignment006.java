class Assignment006 
{
	public static void main(String[] args) 
	{
		int match=0;
		int n=7;
        while(n>1){
            if(n%2==0){
                match+=n/2;
                n=n/2;
            }
            else{
                match+=(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        

		System.out.println(match);
	}
}
