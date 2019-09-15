package org.shubham.home.item8;
/**
Symmetry—The second requirement says that any two objects must agree on
	whether they are equal. Unlike the first requirement, it’s not hard to imagine violating
	this one unintentionally. For example, consider the following class, which
	implements a case-insensitive string. The case of the string is preserved by
	toString but ignored in comparisons:
 */
public final class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	// Broken - violates symmetry!
	@Override
	public boolean equals(Object o) {
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		if (o instanceof String) // One-way interoperability!
			return s.equalsIgnoreCase((String) o);
		return false;
	}
	// ....Remainder omitted
	
	/**
	 * Once you’ve violated the equals contract, you simply don’t
know how other objects will behave when confronted with your object.
To eliminate the problem, merely remove the ill-conceived attempt to interoperate
with String from the equals method. Once you do this, you can refactor the
method to give it a single return:
	 
	 @Override public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
	}
	 
	 * 
	 */
	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		
		System.out.println(s.equals(cis));
	}
}