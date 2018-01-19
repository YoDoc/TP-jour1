package tp1;

import java.util.Arrays;

public class TP7Dichotomie {

	public static void main(String[] args) {
		/**
		 * 
		 * TP 2.1 : la recherche dichotomique
		 * 
		 * créer un tableau contenant 10 entiers trier ce tableau grace au tri par
		 * sélection
		 * 
		 * dans un tableau d'entiers trier par ordre croissant, on lit la valeur qui se
		 * situe au milieu du tableau (mid) si la valeur recherchée est plus grande que
		 * mid ​on recherche à nouveau dans la deuxième moitié du tableau si la valeur
		 * recherchée est plus petite que mid ​on recherche à nouveau dans la première
		 * moitié du tableau si la valeur recherchée est égale à mid c'est gagné!
		 * 
		 * 
		 */

		// Je crée le tableau
		// Je visualise 
		// Trie par sélection par double boucle FOR
		// Visualisation de fin
		
		int[] tab = { 5, 2, 8, 8, 4, 3, 1, 4, 6, 7 };

		System.out.println(Arrays.toString(tab));

		for (int indiceMaxCourant = tab.length - 1; indiceMaxCourant > 0; indiceMaxCourant--) {

			int valeurMaxCourant = 0;
			int indiceCourant =0;

			for (int i = 0; i <= indiceMaxCourant; i++) {
				if (valeurMaxCourant < tab[i]) {
					indiceCourant = i;
					valeurMaxCourant = tab[i];
				}
			}
			int maxTemporaire = tab[indiceMaxCourant];
			tab[indiceMaxCourant] = tab[indiceCourant];
			tab[indiceCourant] = maxTemporaire;
		}
		
		System.out.println(Arrays.toString(tab));

	}
}
