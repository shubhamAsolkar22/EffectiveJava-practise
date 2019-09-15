package org.shubham.home.item8;

import javafx.scene.paint.Color;

public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	// Broken - violates symmetry!
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		return super.equals(o) && ((ColorPoint) o).color == color;
	}

	// ... Remainder omitted
	
	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint(1, 2,Color.ALICEBLUE);
		ColorPoint p2 = new ColorPoint(1, 2,Color.ALICEBLUE);
		ColorPoint p3 = new ColorPoint(1, 2,Color.ALICEBLUE);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));		
	}
}
