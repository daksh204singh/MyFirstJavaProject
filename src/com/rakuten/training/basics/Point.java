package com.rakuten.training.basics;

class Point {
	private double x, y;

	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public boolean equals(Object o) {
		Point p = (Point) o;
		if (p.x == x && p.y == y)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(30, 40);
		
		if (p1.equals(p2))
			System.out.println("Objects are same");
		else
			System.out.println("Objects are not same");
	}
}