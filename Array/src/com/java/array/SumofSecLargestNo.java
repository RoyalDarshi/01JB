package com.java.array;

public class SumofSecLargestNo {
	
	public static int sumOfNo(int []arr) {
		if(arr.length<=3)
			return 0;
		int[] oddLoc;
		int[] evenLoc;
		if(arr.length%2==0) {
			oddLoc=new int[arr.length/2];
			evenLoc=new int[arr.length/2];
		}
		else {
			oddLoc=new int[arr.length/2];
			evenLoc=new int[arr.length/2+1];
		}
		int j=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				evenLoc[j]=arr[i];
				j++;
			}
			else {
				oddLoc[k]=arr[i];
				k++;
			}
		}//for
		int temp=0;
		for(j=0;j<oddLoc.length;j++) {
			for(k=0;k<oddLoc.length;k++) {				
				if(oddLoc[k]<oddLoc[j]) {
					temp=oddLoc[k];
					oddLoc[k]=oddLoc[j];
					oddLoc[j]=temp;
				}
				if(k<oddLoc.length&&evenLoc[k]<evenLoc[j]) {
					temp=evenLoc[k];
					evenLoc[k]=evenLoc[j];
					evenLoc[j]=temp;
				}
				
			}//inner_for
		}//outer_for
		int sum=0;
		if(evenLoc.length==1)
			sum+=evenLoc[0];
		if(oddLoc.length==1)
			sum+=oddLoc[0];
		if(evenLoc.length>=2)
			sum+=evenLoc[evenLoc.length-2];
		if(oddLoc.length>=2)
			sum+=oddLoc[oddLoc.length-2];
		return sum;
	}//sumOfNo()

	public static void main(String[] args) {
		System.out.println(sumOfNo(new int[] {3,2,1,7,5,4}));
	}

}
