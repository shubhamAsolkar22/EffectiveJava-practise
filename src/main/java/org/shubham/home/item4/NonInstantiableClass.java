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
	
}
