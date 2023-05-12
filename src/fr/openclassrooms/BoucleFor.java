package fr.openclassrooms;

public class BoucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boucle d enumeration for avec une valeur entiere et transforme en string
		for (int i = 1; i <= 1000; i++) {
			// Integer permet d utilser ces methodes sur un integer, ici i est integer nous
			// convertissons en string
			// car la methode bonjour recoit en argument un type String
			bonjour("jean " + Integer.toString(i));
		}

		// boucle d enumeration for avec un tableau et l instance du tableau
		int[] myArray = new int[] { 7, 2, 4 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("iteration boucle for sur tableau " + myArray[i]);
		}

		// boucle for each pour iterer sur le tableau sans specifier le nombre de fois
		// et sans length
		for (int number : myArray) {
			System.out.println("iteration boucle for each sur tableau " + number);
		}
	}

	static void bonjour(String nom) {
		System.out.println("bonjour " + nom + "!");

	}
}
