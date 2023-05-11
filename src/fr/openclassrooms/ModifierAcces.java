package fr.openclassrooms;

import static fr.openclassrooms.Shape.center;

public class ModifierAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example.printText();
		Circle.circle();

	}

}

class Shape {
	private static Example center = new Example(); // Essayez avec un private => Ko
}

class Circle extends Shape {
	static void circle() {

		System.out.println("Center == " + center);
	}
}

class Example {
	static String text = "hello";

	public static void printText() {
		System.out.println(text);
	}
}