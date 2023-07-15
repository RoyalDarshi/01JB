import java.util.Scanner;
class DateVerifier {
	public static void main(String[] args) {
		int dd,mm,yyyy;
		dd=mm=yyyy=0;
		boolean dk,mk,yk;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println();
			System.out.print("Please Enter Day(DD):");
			dd=s.nextInt();
			System.out.println();
			dk=false;
			if(dd<32&&dd>0) {
				dk=true;
				do {
					System.out.print("Please Enter Month(MM):");
					mm=s.nextInt();
					System.out.println();
					mk=false;
					if(mm<13&&mm>0) {
						mk=true;
						if(mm==4||mm==6||mm==9||mm==11) {
							if(dd==31) {
								dk=false;
								System.out.println("\n\tMonth Doesn't Contain 31 Days!\n");								
								break;
							}
							else {
								do {
									System.out.print("Please Enter Year(YYYY):");
									yyyy=s.nextInt();
									System.out.println();
									yk=false;
									if(yyyy<=2500&&yyyy>=1500) {
										yk=true;
										System.out.println("\n\tDate is Valid");
									}
									else {
										System.out.println("\n\tPlease Enter Year From 1500 To 2500!\n");
									}									
								}while(yk!=true);
							}
						}
						else if(mm==2) {
							if(dd>29) {
								dk=false;
								System.out.println("\n\tMonth Doesn't Contain "+dd+" Days\n");								
								break;
							}
							do {
								System.out.print("Please Enter Year(YYYY):");
								yyyy=s.nextInt();
								System.out.println();
								yk=false;
								if(yyyy%4!=0) {
									if(dd==29) {
										dk=false;
										System.out.println("\tThis is not a Leep Year!\n");									
										break;
									}
									else {
										if(yyyy<=2500&&yyyy>=1500) {
											dk=true;
											yk=true;
											System.out.println("\n\tDate is Valid");
										}
										else {																	
											System.out.println("\n\tPlease Enter Year From 1500 To 2500!\n");
										}
									}
								}
								else {																
									if(yyyy<=2500&&yyyy>=1500) {
										dk=true;
										yk=true;
										System.out.println("\n\tDate is Valid");
									}
									else {																	
										System.out.println("\n\tPlease Enter Year From 1500 To 2500!\n");
									}
								}
							}while(yk!=true);
						}
						else {
							do {
									System.out.print("Please Enter Year(YYYY):");
									yyyy=s.nextInt();
									System.out.println();
									yk=false;
									if(yyyy<=2500&&yyyy>=1500) {
										yk=true;
										System.out.println("\n\tDate is Valid");
									}
									else {
										System.out.println("\n\tPlease Enter Year From 1500 To 2500!\n");
									}									
								}while(yk!=true);
						}
					}
					else {
						System.out.println("\n\tPlease Enter Month From 1 To 12!\n");
					}					
				}while(mk!=true);
			}
			else {
				System.out.println("\n\tPlease Enter Valid Day!\n");
			}			
		}while(dk!=true);
		if(dd>9) {
			if(mm>9) {
				System.out.println("\n\t\tDate Is: "+dd+"/"+mm+"/"+yyyy);
			}
			else {
				System.out.println("\n\t\tDate Is: "+dd+"/0"+mm+"/"+yyyy);
			}
		}
		else {
				if(mm>9) {
					System.out.println("\n\t\tDate Is: 0"+dd+"/"+mm+"/"+yyyy);
				}
				else {
					System.out.println("\n\t\tDate Is: 0"+dd+"/0"+mm+"/"+yyyy);
				}
		}
	}
}