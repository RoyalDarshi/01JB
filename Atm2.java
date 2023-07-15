import java.util.*;
import java.lang.*;
import java.io.*;
class Atm2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t--!=0) {
		    int kMoney=scn.nextInt();
		    int nPeople=scn.nextInt();
		    for (int i=0;i<nPeople;i++){
		        int unit=scn.nextInt();
		        if(unit<=kMoney){
		            kMoney-=unit;
		            System.out.print("1");
		        }
		        else
		            System.out.print("0");
		    }
			System.out.println();
		}
	}
}