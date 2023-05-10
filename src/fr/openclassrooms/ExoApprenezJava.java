package fr.openclassrooms;

public class ExoApprenezJava {
	static int epargne = 500;
	static int revenus = 2000;
	static int ancienRevenus = 2000;

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
