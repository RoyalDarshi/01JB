import java.util.Scanner;
class DateCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a date(dd):");
		int dd=s.nextInt();
		System.out.println("Enter a Month(mm):");
		int mm=s.nextInt();
		System.out.println("Enter a Year(yyyy):");
		int yyyy=s.nextInt();
		boolean kd,md,yd;
		md=yd=true;
		kd=false;
		if (dd>31||dd<1) {
			System.out.println("Please enter valid day");
		}
		else if(mm<=12&&mm>0) {
			if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12) {
				if(dd>31||dd<1) {
					kd=false;
				}
				else
					kd=true;
			}
			else if(mm==4||mm==6||mm==9||mm==11) {
				if(dd>30||dd<1) {
					kd=false;
				}
				else
					kd=true;
			}
			else if(mm==2) {
				if(yyyy%4==0) {
					if(dd>29||dd<1) {
						kd=false;
					}
					else if(dd>28) {
						kd=false;
					}
					else
						kd=true;
				}
			}
			if (kd==false) {
				System.out.println("Please enter valid day!");
			}
		}
			if(mm>12||mm<1) {
				md=false;
				System.out.println("Please enter valid month!");
			}
			if(yyyy<=0||yyyy>=9999) {
				yd=false;
				System.out.println("Please enter valid year!");
			}
		if(kd==true&&md==true&&yd==true)
			System.out.println("Date is valid");
	}//End of Main
}//End of Class