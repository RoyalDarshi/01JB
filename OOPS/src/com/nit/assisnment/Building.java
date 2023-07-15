package com.nit.assisnment;


public class Building {
	private String ownerName;
	private String sizeOfTheBuilding;
	private String address;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSizeOfTheBuilding() {
		return sizeOfTheBuilding;
	}

	public void setSizeOfTheBuilding(String sizeOfTheBuilding) {
		this.sizeOfTheBuilding = sizeOfTheBuilding;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		builder.append("\tBuiding Owner Name:\t\t"+ownerName+"\n");
		builder.append("\tSize of Building:\t\t"+sizeOfTheBuilding+"\n");
		builder.append("\tAddress of Building:\t\t"+address+"\n");
		return builder.toString();
	}
}