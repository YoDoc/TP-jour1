// PROGRAMME MARCHE BIEN SAUF LES CAS D'ERREUR OÙ ON A UN CHIFFRE DOUBLON (TRI S'ARRETE) 
// ET OU LE CHIFFRE N'EXISTE PAS DANS LE TABLEAU, LA BOUCLE WHILE NE S'ARRETE PAS

package codesMac;

import java.util.Arrays;
import java.util.Scanner;

public class TriEtRechercheDichotomique {
	/*
	 * * TP 2.1 : la recherche dichotomique créer un tableau contenant 10 entiers
	 * Trier ce tableau grace au tri par sélection: trouver le plus grand nombre du
	 * tableau l'échanger avec le dernier élément non trier du tableau recommencer
	 * Dans un tableau d'entiers trier par ordre croissant, on lit la valeur qui se
	 * situe au milieu du tableau (mid) si la valeur recherchée est plus grande que
	 * mid on recherche à nouveau dans la deuxième moitié du tableau si la valeur
	 * recherchée est plus petite que mid on recherche à nouveau dans la première
	 * moitié du tableau si la valeur recherchée est égale à mid c'est gagné!
	 */
	public static void main(String[] args) {
		int[] tab = { 10, 92, 34, 23, 40, 62, 66, 81, 79, 13, 12, 24, 59, 49, 90, 44, 3, 6, 7, 9, 2, 4, 8, 5, 1 };
		System.out.println("Tableau d'origine " + Arrays.toString(tab));
		boolean travail = true;
		for (int taille = (tab.length - 1); taille > 0 && travail == true; taille--) {
			for (int i = 0; i < taille; i++) {
				travail = false;
				if (tab[i] > tab[i + 1]) {
					int temp = tab[i + 1];
					tab[i + 1] = tab[i];
					tab[i] = temp;
					travail = true;
				}
			}
		}

		System.out.println("Tableau trié: " + Arrays.toString(tab));
		System.out.println("Sa taille est de: " + (tab.length - 1));
		System.out.println("valeur milieu " + tab[(tab.length - 1) / 2]);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Quelle est la valeur recherchée?");
		int valeurRech = userInput.nextInt();
		userInput.close();
		System.out.println("La valeur recherchée est " + valeurRech);
		int tailleMin = 0;
		int tailleMax = tab.length - 1;
		int tailleMid = (tailleMax - tailleMin) / 2;
		boolean trouve = false;
		int i = 1;
		while (trouve == false) {
			if (tab.length>1 && valeurRech == tab[tailleMid]) {
				trouve = true;
				System.out.println("j'ai trouvé ta valeur, elle est en position " + tailleMid);
				System.out.println("nombre de tour pour trouver: " + i);
			} else if (tailleMax==1 && valeurRech != tab[tailleMid]) {
				trouve = true;
				System.out.println("Cette valeur n'existe pas dans le tableau");
			} else if (tailleMax>1 && valeurRech < tab[tailleMid]) {
				trouve = false;
				tailleMax = tailleMid - 1;
				tailleMid = (tailleMax + tailleMin) / 2;
				System.out.println("nombre de tour en cours: " + i);
				i++;
			} else if (tailleMax>1 && valeurRech > tab[tailleMid]) {
				trouve = false;
				tailleMin = tailleMid + 1;
				tailleMid = (tailleMax + tailleMin) / 2;
				System.out.println("nombre de tour en cours: " + i);
				i++;
			}
		}
	}
}