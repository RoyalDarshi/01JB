class CheckLastDigit 
{
	static boolean checkNumber(int[] arr){
		if(arr.length>1&&arr[0]==arr[arr.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		int[] arr={76,32,87,76};
		boolean result=checkNumber(arr);
		System.out.println(result);
	}
}
