package org.shubham.home.item8;

public class OverridingEqualsMethod {
	/*
	 *
		When you override the equals method, you must adhere to its general contract.
	Here is the contract, copied from the specification for Object [JavaSE6]:

	The equals method implements an equivalence relation. It is:
	
	• Reflexive: For any non-null reference value x, x.equals(x) must return true.
	• Symmetric: For any non-null reference values x and y, x.equals(y) must return
	true if and only if y.equals(x) returns true.
	• Transitive: For any non-null reference values x, y, z, if x.equals(y) returns
	true and y.equals(z) returns true, then x.equals(z) must return true.
	• Consistent: For any non-null reference values x and y, multiple invocations
	of x.equals(y) consistently return true or consistently return false, provided
	no information used in equals comparisons on the objects is modified.
	• For any non-null reference value x, x.equals(null) must return false.
	
	 */
	
	Object o = null;
	String s = "sds";
}
