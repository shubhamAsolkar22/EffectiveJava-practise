package org.shubham.home.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
	private final Date birthDate;

	private Person() {
		birthDate = new Date();
	}

	private Person(Date date) {
		birthDate = date;
	}

	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

	/*
	 * 
	 * // Hideously slow program! Can you spot the object creation? public static
	 * void main(String[] args) { Long sum = 0L; for (long i = 0; i
	 * <Integer.MAX_VALUE; i++) { sum += i; } System.out.println(sum); } This
	 * program gets the right answer, but it is much slower than it should be, due
	 * to a one-character typographical error. The variable sum is declared as a
	 * Long instead of a long, which means that the program constructs about 231
	 * unnecessary Long instances (roughly one for each time the long i is added to
	 * the Long sum). Changing the declaration of sum from Long to long reduces the
	 * runtime from 43 seconds to 6.8 seconds on my machine. The lesson is clear:
	 * prefer primitives to boxed primitives, and watch out for unintentional
	 * autoboxing.
	 */

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
