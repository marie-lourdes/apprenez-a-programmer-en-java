package fr.openclassrooms;

public class BoucleWhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boucle While et nombre aleatoire
		int i = 0;
		while (i < 90) { // condition doit etre true pour lanacer la boucle
			print("i avant change de valeur aleatoire " + Integer.toString(i));
			i = randomNumber();// on affecte une valeur aleatoire
			print(Integer.toString(i));
		}
		// boucle while exo forest
		int numberOfTrees = 0;
		while (numberOfTrees < 10) {
			numberOfTrees += 1;
			System.out.println("I planted" + numberOfTrees + " trees");
		}
		System.out.println("i have a forest");

		// boucle do while pushupgoal, meme si le compteur etait a 0, la condition en
		// fin de bloc serait false mais la boucle effectuerai
		// au moins une instruction mais avec la boucle While elle demarrerai pas avec
		// le compteur pushUpGoal a 0

		int pushUpGoal = 10;
		do {
			print("push up!");
			pushUpGoal -= 1;

		} while (pushUpGoal > 0);
	}

	// méthodes
	static void print(String nombre) {
		System.out.println("Nombre :  " + nombre);
	}

	// Math.random()+(max-min)+min: On renvoie un entier aléatoire entre une valeur
	// min (incluse)
	// et une valeur max (exclue).
	static int randomNumber() {
		return (int) ((Math.random() * ((100 - 1) + 1)) + 1);
	}

}
