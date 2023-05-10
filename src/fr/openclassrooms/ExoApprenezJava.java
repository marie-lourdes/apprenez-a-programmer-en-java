package fr.openclassrooms;

public class ExoApprenezJava {
	static int epargne = 500;
	static int revenus = 2000;
	static int ancienRevenus = 2000;
	// avec les methode utilitaire , cette classe n est pas une classe de modeles
	// mais une classe utilitaire
	// dont les methodes sont accessibles directement avec la calsse et non une
	// instance et on ajoute private pour que ces methode ne soit accessible a
	// aucune autre classe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" mon revenu : " + ancienRevenus + "euros ");
		calcEconomie(100);
	}

	private static int calcRevenu(int extra) {

		revenus -= extra;
		return revenus;
	}

	private static int calcEpargne(int extra) {

		epargne += extra;
		return epargne;
	}

	private static void calcEconomie(int extra) {
		revenus = calcRevenu(extra);
		epargne = calcEpargne(extra);
		revenus = revenus + (30 - 10) * 7;
		int nombreJourRevenuEpargne = (5000 - revenus) / 500;
		System.out.println("le revenu est de, après calcul de l epargne et de mes depenses, " + revenus + "euros "
				+ ",mon epargne: " + epargne + "euros " + "je pourrais economiser 5000 euros sur "
				+ nombreJourRevenuEpargne + "jours");
	}
}
