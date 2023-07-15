class CheckDupValues 
{
	public static int checkDup(int[] arr){
		int count=0;
		
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==arr[i]){
					count++;
					
				}
			}
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int[] arr={32,32,32,12,32,87,12,0,0};
		int dup=checkDup(arr);
		System.out.println("Number of duplicates are: "+dup);
	}
}
