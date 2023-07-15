import java.util.Scanner;
class NumberPrinter {
	public static void main(String[] args) {
		System.out.print("Enter a Three Letter Value:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String minus="";
		if(a<0) {  //Checking number < 0
			minus="Minus";
			a=a*(-1);
		}
		String htr,ttr,otr;
		htr=ttr=otr="";
		int x,y,z;	
		x=y=z=0;
		z=a%10;//ones digit
		a=a/10;
		y=a%10;//tens digit
		a=a/10;
		x=a%10;//hundreds digit
		a=a/10;
		if(a>0)//checking number<1000
			System.out.print("Please enter a three digit number!");
		else {
			//Printing Hundreds
			if(x==1)
				htr=" One Hundred";
			else if(x==2)
				htr=" Two Hundred";
			else if(x==3)
				htr=" Three Hundred";
			else if(x==4)
				htr=" Four Hundred";
			else if(x==5)
				htr=" Five Hundred";
			else if(x==6)
				htr=" Six Hundred";
			else if(x==7)
				htr=" Seven Hundred";
			else if(x==8)
				htr=" Eight Hundred";
			else if(x==9)
				htr=" Nine Hundred";
			//Printing Tens
			if(y==2)
				ttr=" Twenty";
			else if(y==3)
				ttr=" Thirty";
			else if(y==4)
				ttr=" Fourty";
			else if(y==5)
				ttr=" Fifty";
			else if(y==6)
				ttr=" Sixty";
			else if(y==7)
				ttr=" Seventy";
			else if(y==8)
				ttr=" Eighty";
			else if(y==9)
				ttr=" Ninety";
			//Printing 0 to 19
			if(y==1&&z==0)
				ttr=" Ten";
			else if(y==1&&z==1)
				ttr=" Eleven";
			else if(y==1&&z==2)
				ttr=" Twelve";
			else if(y==1&&z==3)
				ttr=" Thirteen";
			else if(y==1&&z==4)
				ttr=" Fourteen";
			else if(y==1&&z==5)
				ttr=" Fifteen";
			else if(y==1&&z==6)
				ttr=" Sixteen";
			else if(y==1&&z==7)
				ttr=" Seventeen";
			else if(y==1&&z==8)
				ttr=" Eighteen";
			else if(y==1&&z==9)
				ttr=" Nineteen";
			else if(x==0&&y==0&&z==0)
				otr="Zero";
			else if(z==1)
				otr=" One";
			else if(z==2)
				otr=" Two";
			else if(z==3)
				otr=" Three";
			else if(z==4)
				otr=" Four";
			else if(z==5)
				otr=" Five";
			else if(z==6)
				otr=" Six";
			else if(z==7)
				otr=" Seven";
			else if(z==8)
				otr=" Eight";
			else if(z==9)
				otr=" Nine";
			System.out.println();
			System.out.print("\t==>");
			System.out.print(minus);
			System.out.print(htr);
			System.out.print(ttr);
			System.out.print(otr);
			System.out.println();
			System.out.println();
		}
		
	}
}