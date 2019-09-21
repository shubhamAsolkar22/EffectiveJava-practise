package org.shubham.home.item8;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) { 
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
	// ... Remainder omitted	
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(1, 2);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));		
	}
}
