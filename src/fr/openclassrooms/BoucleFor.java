package fr.openclassrooms;

public class BoucleFor {

	public static void main(String[] args) {

		// boucle d enumeration for avec une valeur entiere et transforme en string
		for (int i = 1; i <= 1000; i++) {
			// Integer permet d utilser ces methodes sur un integer, ici i est integer nous
			// convertissons en string
			// car la methode bonjour recoit en argument un type String
			bonjour("Jean " + Integer.toString(i));
		}

		// boucle d enumeration for avec un tableau et l instance du tableau
		int[] myArray = new int[] { 7, 2, 4 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("iteration boucle for sur tableau " + myArray[i]);
		}

		// boucle for each pour iterer sur le tableau sans specifier le nombre de fois
		// et sans length, la boucle itere sur number du tableau myArray
		for (int number : myArray) {
			System.out.println("iteration boucle for each sur tableau " + number);
		}

		// boucle for et instruction continue; pour ignorer une iteration
		for (int i = 0; i < 10; i++) {
			if (i == 2 || i == 5) {
				continue;
			}

			System.out.println("valeur de i : " + i + ".");
		}

		// boucle for avec interruption de la sequence d execution de la boucle avec l
		// instruction break; quand l element est trouvé
		int[] myArray2 = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < myArray2.length; i++) {
			if (myArray2[i] == 50) {
				System.out.println("j'ai trouvé " + myArray2[i] + "!");
				break;
			}
			System.out.println("J'en suis à " + myArray2[i] + "...");
		}

	}

	// methodes
	static void bonjour(String nom) {
		System.out.println("bonjour " + nom + "!");

	}
}
