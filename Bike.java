class Bike {
	private int gear;
	public void setGear(int gear){
		if(gear<0||gear>5)
			throw new IllegalArgumentException("Gear should be (0-5) !");
		this.gear=gear;
	}
	public int getGear(){
		return gear;
	}
}
