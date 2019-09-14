package org.shubham.home.item3;

//Enum singleton - the preferred approach
public enum Elvis {
	INSTANCE;
	
	public void leaveTheBuilding() { 
		System.out.println("Elvis left the building!");
	}
}
