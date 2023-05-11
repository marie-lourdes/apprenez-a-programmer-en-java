package fr.openclassrooms;

public class OC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exempleStr = "hello";
		exempleStr = exempleStr.toUpperCase();
		exempleStr = exempleStr.replace("HELL", "YEAH");
		System.out.println(exempleStr);
		ArrayExo.printTab();

	}
}

class ArrayExo {
	// la taille du tableau n est pas modifiable on peut lire length mais pas l
	// assigné et modifer
	public static int[] array1 = new int[2];
	public static int num1 = array1.length;

	public static void printTab() {
		System.out.println(num1);
	}

}
