package fr.openclassrooms;

public class LessonOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thisYear = 2019;
		String birthdayMonth = "June";
		int firstDay = 3;

		// TODO tape 1 : créez une variable daysInWeek avec une valeur de 7
		int daysInWeek = 7;

		// TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable
		// firstDay, en utilisant un opérateur raccourci
		firstDay += daysInWeek;

		// TODO Etape 3 : créez une constante numérique nommé STARTINGDAY avec la
		// nouvelle valeur de la variable firstDay
		final int STARTINGDAY = firstDay;

		// Affiche le résultat
		System.out.println(
				"There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);

		// melangez les types numeriques

		int a = 5;
		int b = 2;
		float result = (float) a / b;
		// (float) a =>caster la variable a et indiquer le type float aussi pour
		// resultat sinon l'ordianteur retourne 2 au lieu de 2.5
		System.out.println("result " + result);
	}

}
