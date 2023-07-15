import java.util.Scanner;
class BikeRider extends Bike {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Bike bike=new Bike();
		while(true){
			try{
				System.out.print("Please Enter Gear No: ");
				bike.setGear(scn.nextInt());
				if(bike.getGear()==0)
					System.out.println("Bike is Neutral");
				else
					System.out.println("Bike is running on gear: "+bike.getGear());			
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
