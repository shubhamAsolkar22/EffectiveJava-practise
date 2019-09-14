package org.shubham.home.item4;

public class NonInstantiableClass {

	/*
	 * Because the explicit constructor is private, it is inaccessible outside of
	 * the class. The AssertionError isn’t strictly required, but it provides
	 * insurance in case the constructor is accidentally invoked from within the
	 * class. It guarantees that the class will never be instantiated under any
	 * circumstances. This idiom is mildly counterintuitive, as the constructor is
	 * provided expressly so that it cannot be invoked. It is therefore wise to
	 * include a comment, as shown above. 
	 * 
	 * As a side effect, this idiom also prevents
	 * the class from being subclassed. All constructors must invoke a superclass
	 * constructor, explicitly or implicitly, and a subclass would have no
	 * accessible superclass constructor to invoke.
	 */

	// supress default constructor for non-instantiability.
	private NonInstantiableClass() {
		throw new AssertionError();
	}
	
	
	
	/*
	 * Attempting to enforce noninstantiability by making a class abstract does
	 * not work. The class can be subclassed and the subclass instantiated. Furthermore,
	 * it misleads the user into thinking the class was designed for inheritance (Item 19).
	 * There is, however, a simple idiom to ensure noninstantiability. A default constructor
	 * is generated only if a class contains no explicit constructors, so a class can be
	 * made noninstantiable by including a private constructor:
	
	// Noninstantiable utility class
	public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
	throw new AssertionError();
	}
	... // Remainder omitted
	}
	
	*/
}
