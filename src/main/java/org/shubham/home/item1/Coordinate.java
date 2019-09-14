package org.shubham.home.item1;
/*
 * Consider static factory methods instead of constructors.
 */
public class Coordinate {
	private double xCoordinate;
	private double yCoordinate;
	
	private Coordinate(double x,double y) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
	}
	
	/**
	 * static factory method to generate instance of Coordinate class.
	 * 
	 * ADVANTAGES:-
	 * 1. Static factory method lets you give informative names than constructors.
	 * 2. We have two ways to create an instance with the same parameter types.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static final Coordinate getInstanceFromXY(double x, double y) {
		return new Coordinate(x, y);
	}
	
	/**
	 * 
	 * @param dist
	 * @param angle
	 * @return
	 */
	public static final Coordinate getInstanceFromPolar(double dist, double angle) {
		return new Coordinate(dist * Math.cos(angle), dist * Math.sin(angle));
	}

	
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
}
