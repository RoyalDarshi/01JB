package com.nit.assisnment;

public class AssociationTest {
	public static void main(String[] args) {
		Contractor contract=new Contractor();
		System.out.println("\n\t*************Contract Details*************\n");
		System.out.println("\tContract Name:\t\t\t"+contract.getContractName());		
		System.out.println("\tContractor Phone Number:\t"+contract.getPhoneNumber());		
		System.out.println("\tContractor Address:\t\t"+contract.getAddress());		
		System.out.println("\tContract Owner Name:\t\t"+contract.getOwnerName());
		System.out.println(contract.getBuilding());
	}
}
