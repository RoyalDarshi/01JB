/*
nput: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
*/

class Assignment004 
{
	public static void main(String[] args) 
	{		
		int[] nums={4,6,7};
		int[] arr=new int[nums.length*2];
		for(int i=0;i<nums.length;i++){
			arr[i]=arr[i+nums.length]=nums[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
