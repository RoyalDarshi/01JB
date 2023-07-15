/*
	Input: n = 234
	Output: 15 
	Explanation: 
	Product of digits = 2 * 3 * 4 = 24 
	Sum of digits = 2 + 3 + 4 = 9 
	Result = 24 - 9 = 15
*/
import java.util.Scanner;
class Assignment002 
{
	public static void main(String[] args) 
	{
		int no=234;
		int product=1;
		int sum=0;
		while(no>0){
			product*=no%10;
			sum+=no%10;
			no/=10;
		}
		System.out.println(product-sum);
		
	}
}
