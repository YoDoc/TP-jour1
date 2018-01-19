package tp1;

/**
 * Calculer somme de tous les chiffres de 1 à n D'abord en While
 * 
 *
 */

public class SommeDeChiffresEnWhileEtFor {

	public static void main(String[] args) {

		int chiffre = 0;
		int chiffreEnCours = 0;
		int n = 6;
		int somme = 0;

		// While
		while (chiffreEnCours <= n) {
			somme = somme + chiffreEnCours;
			chiffreEnCours++;
		}
		System.out.println(
				"En boucle While la somme de tous les chiffres de " + chiffre + " à " + n + " est " + somme + ".");
		// Fin While

		// For
		// Super important, je dois réinitialiser les variables!!

		somme = 0;

		for (int i = 0; i <= n; i++) {
			somme = somme + i;

		}
		System.out.println(
				"En boucle For la somme de tous les chiffres de " + chiffre + " à " + n + " est " + somme + ".");

	}

}
