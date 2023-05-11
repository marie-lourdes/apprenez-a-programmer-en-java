package fr.openclassrooms;

public class ModifierAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example.printText();
		Shape.printNum();

	}

}

class Shape {
	static Example center = new Example(); // Essayez avec un private => Ko

	static void printNum() {
		Circle.circle(Circle.number);
		center.text = "hola"; // surligné car la variable de la class example est static et utilisé
								// directement sur la class sans instance
		center.printText("bonjour");
		System.out.println(center.text);

	}
}

class Circle extends Shape {
	static int number = 1;

	public static void circle(int number) {

		System.out.println(number);
	}
}

class Example {
	public static String text = "hello";

	public void printText(String text) {
		System.out.println(text);
	}
}
