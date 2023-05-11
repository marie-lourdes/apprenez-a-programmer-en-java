package fr.openclassrooms;

public class ModifierAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example.printText();
		Shape.printNum();

	}

}

class Shape {
	static Example center = new Example(); // Essayez avec un private => Ko

	static void printNum() {
		Circle.circle(Circle.number);

	}
}

class Circle extends Shape {
	static int number = 1;

	public static void circle(int number) {

		System.out.println(number);
	}
}

class Example {
	static String text = "hello";

	public static void printText() {
		System.out.println(text);
	}
}