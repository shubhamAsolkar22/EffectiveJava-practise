package org.shubham.home.item3;
/**
 * Item 3: Enforce the singleton property with a private
 * constructor or an enum type
 */
//Enum singleton - the preferred approach
public enum Elvis {
	INSTANCE;
	
	public void leaveTheBuilding() { 
		System.out.println("Elvis left the building!");
	}
}
