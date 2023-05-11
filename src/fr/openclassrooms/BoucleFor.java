package fr.openclassrooms;

public class BoucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			bonjour("jean " + Integer.toString(i));

		}
	}

	static void bonjour(String nom) {
		System.out.println("bonjour " + nom + "!");

	}

}
