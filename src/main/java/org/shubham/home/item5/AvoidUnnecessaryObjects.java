package org.shubham.home.item5;

/*

 As an extreme example of what not to do, consider this statement:
String s = new String("stringette"); // DON'T DO THIS!
The statement creates a new String instance each time it is executed, and
none of those object creations is necessary. The argument to the String constructor
("stringette") is itself a String instance, functionally identical to all of the
objects created by the constructor. If this usage occurs in a loop or in a frequently
invoked method, millions of String instances can be created needlessly.
The improved version is simply the following:
String s = "stringette";

 */


public class AvoidUnnecessaryObjects {
	/**
	 * 
	 * The counterpoint to this item is Item 39 on defensive copying. Item 5 says,
	 * “Don’t create a new object when you should reuse an existing one,” while Item
	 * 39 says, “Don’t reuse an existing object when you should create a new one.”
	 * Note that the penalty for reusing an object when defensive copying is called
	 * for is far greater than the penalty for needlessly creating a duplicate
	 * object. Failing to make defensive copies where required can lead to insidious
	 * bugs and security holes; creating objects unnecessarily merely affects style
	 * and performance.
	 */
}
