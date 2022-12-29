package com.ntt.c;

import java.util.Scanner;

abstract class Shape {
	float area;

	abstract void input();

	abstract void calArea();

	void disp() {
		System.out.println("Area is: " + area);
	}
}

class Square extends Shape {
	float l;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of square:");
		l = scan.nextFloat();
	}

	void calArea() {
		area = l * l;
	}
}

class Rectangle extends Shape {
	float l, b;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		l = scan.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		b = scan.nextFloat();
	}

	void calArea() {
		area = l * b;
	}
}

class Circle extends Shape {
	float r;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the area of circle:");
		r = scan.nextFloat();
	}

	void calArea() {
		area = (float) ((3.14) * (r * r));
	}
}

class Geometry {
	void allowShape(Shape ref) {
		ref.input();
		ref.calArea();
		ref.disp();
	}
}

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Geometry g = new Geometry();

		g.allowShape(s);
		System.out.println("-------------");
		g.allowShape(r);
		System.out.println("-------------");
		g.allowShape(c);
	}

}