package tp1;

import java.util.Arrays;

public class TP6InversionBulle {
	/**
	 * 
	 * TP 6
	 * Ecrire l'algorithme du tri à bulles (et oui...)
	 * 
	 * 
	 * 
	 * 6 0 3 5 1 4 2 // On compare 6 et 0 : on inverse
	 * 
	 * 0 6 3 5 1 4 2 // On compare 6 et 3 : on inverse
	 * 
	 * 0 3 6 5 1 4 2 // On compare 6 et 5 : on inverse
	 * 
	 * 0 3 5 6 1 4 2 // On compare 6 et 1 : on inverse
	 * 
	 * 0 3 5 1 6 4 2 // On compare 6 et 4 : on inverse
	 * 
	 * 0 3 5 1 4 6 2 // On compare 6 et 2 : on inverse
	 * 
	 * 0 3 5 1 4 2 6 // Fin
	 * 
	 * A chaque passage, le plus grand nombre est forcément situer en fin de
	 * tableau....
	 * 
	 * 
	 * Il me faut: créer un tableau d'entiers comparer la valeur d'indice 0 et 1. La
	 * valeur plus grande passe en indice 1 comparer la valeur d'indice 2 et 1. La
	 * valeur plus grande passe en indice 2 jusqu'au plus grand indice actuel
	 * l'indice diminue de 1 et on passe de nouveau au départ, sur un tableau
	 * d'indice max-1
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// création tableau et visualisation
		int tab[] = { 0, 6, 0, 3, 5, 1, 4, 2 };

		System.out.println(Arrays.toString(tab));

		// je déclare ma taille de tableau
		int TailleCouranteDuTableau = tab.length;

		boolean estCeQuonAInverserQQChose = true;
		// Je boucle tant que la partie à trier est supérieure à 0
		for (int ResteàTrier = TailleCouranteDuTableau - 1; ResteàTrier > 0 && estCeQuonAInverserQQChose==true; ResteàTrier--) {
			// Aucun besoin de définir le départ, juste comparer i avec i-1
			// comparer valeur indice i avec i-1 
			// Si valeur en indice i-1 est plus grande que i, 
			// je stocke ma valeur en i, j'affecte mon i-1 à i et j'affecte mon temporaire à i-1.
			estCeQuonAInverserQQChose = false;
			for (int i = 1; i <= TailleCouranteDuTableau - 1 ; i++) {
				if (tab[i - 1] > tab[i]) {
					int MaxTemporaire = tab[i];
					tab[i] = tab[i - 1];
					tab[i - 1] = MaxTemporaire;
					estCeQuonAInverserQQChose = true;
					// J'ai comparé la 1ere valeur avec les autres et à chaque tour je l'ai glissé
					// au bout. OK
					// Je dois maintenant diminuer la taille de mon tableau de 1.
				}

			}
			System.out.println(Arrays.toString(tab));
		}
	}
}
