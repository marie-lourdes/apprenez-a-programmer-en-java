package conditions.hello;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			sayHelloTo(args[0]);
		} else {
			sayHelloTo("world");
		}

	}

	private static void sayHelloTo(String recipient) {
		System.out.println("Hello " + recipient + "!");
	}

}
