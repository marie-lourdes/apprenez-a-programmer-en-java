package fr.openclassrooms;

public class ExoBoucleJava {

	public static void main(String[] args) {
		// TODO: Créez une boucle "for" qui affiche la phrase "I am having so much fun!"
		// 5 fois
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("I'm having so much fun" + i);
		}
	}

}
