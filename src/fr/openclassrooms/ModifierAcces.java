package fr.openclassrooms;

public class ModifierAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example.printText();
		Circle.circle();

	}

}

class Shape {
	static Example center = new Example(); // Essayez avec un private => Ko
	int num = Circle.number;

	int printNum(int num) {
		return num;
	}

}

class Circle extends Shape {
	static int number = 1;

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