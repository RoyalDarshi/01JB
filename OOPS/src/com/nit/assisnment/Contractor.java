package com.nit.assisnment;

import java.util.Scanner;

public class Contractor {
	private String contractName;
	private String phoneNumber;
	private String address;
	private String ownerName;
	private Building building;
	
	{
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter Contract Name: ");
			setContractName(scn.nextLine());
			System.out.print("Enter Contractor Phone Number: ");
			setPhoneNumber(scn.nextLine());
			System.out.print("Enter Contractor Address: ");
			setAddress(scn.nextLine());
			System.out.print("Enter Contract Owner Name: ");
			setOwnerName(scn.nextLine());
			building=new Building();
			System.out.print("Enter Building Address: ");
			building.setAddress(scn.nextLine());
			System.out.print("Enter Building Owner Name: ");
			building.setOwnerName(scn.nextLine());
			System.out.print("Enter Size of Building: ");
			building.setSizeOfTheBuilding(scn.nextLine());
		}
	}
	
	public Contractor() {
		super();
	}
	
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	
}
