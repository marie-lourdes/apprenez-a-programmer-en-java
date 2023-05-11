package fr.openclassrooms;

public class BoucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			// Integer permet d utilser ces methodes sur un integer, ici i est integer nous
			// convertissons en string
			// car la methode bonjour recoit en argument un type String
			bonjour("jean " + Integer.toString(i));
		}
	}

	static void bonjour(String nom) {
		System.out.println("bonjour " + nom + "!");

	}

}
